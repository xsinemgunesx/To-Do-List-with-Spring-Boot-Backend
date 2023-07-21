package com.todoList.error.handler;

import com.todoList.common.DefaultResponse;
import com.todoList.common.ServiceResult;
import com.todoList.data.enums.HataCodes;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;


@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    private final MessageSource messageSource;

    public RestResponseEntityExceptionHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(value = {ConstraintViolationException.class})
    protected ServiceResult<Object> processRuntimeException(ConstraintViolationException ex, WebRequest request) {
        String errors = ex.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(", "));
        return new ServiceResult<>(null, errors, HataCodes.BASIC_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ServiceResult<Object> handleGlobal(Exception ex, WebRequest request) {
        return new ServiceResult<>(null, ex.getMessage(), HataCodes.BASIC_ERROR);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errors = getMessage(ex.getBindingResult().getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining(", ")));
        return new ResponseEntity<>(
                new DefaultResponse<>(errors, "", getURI(request), getIpAddress(request)),
                addHeader(),
                HttpStatus.BAD_REQUEST
        );
    }

    private HttpHeaders addHeader() {
        HttpHeaders headers = new HttpHeaders();
        return headers;
    }

    private String getIpAddress(WebRequest request) {
        HttpServletRequest req = ((ServletWebRequest) request).getRequest();
        String ipAddress = req.getHeader("X-FORWARDED-FOR");
        return ipAddress == null ? req.getRemoteAddr() : ipAddress;
    }

    private String getURI(WebRequest request) {
        return ((ServletWebRequest) request).getRequest().getRequestURI();
    }

    private String getMessage(String codes) {
        try {
            return messageSource.getMessage(codes.split(", ")[0], null, LocaleContextHolder.getLocale());
        } catch (Exception ex) {
            return "Hatalı parametre";
        }
    }
}
