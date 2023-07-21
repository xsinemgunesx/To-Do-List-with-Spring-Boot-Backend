package com.todoList.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.todoList.common.DefaultResponse;
import com.todoList.common.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public abstract class BaseController {

    @Autowired
    protected ObjectMapper objectMapper;


    protected <T /*extends BaseResponse*/> ResponseEntity<Object> createResponse(ServiceResult<T> serviceResult) {

        return new ResponseEntity<>(new DefaultResponse<>(/*serviceResult.getStatus(),*/serviceResult.getCode() + "", serviceResult.getMessage(), serviceResult.getData(), "", "")
                , HttpStatus.OK);
    }

    protected <T> ResponseEntity<Object> createOkResponse(T value, String message) {
        return new ResponseEntity<>(new DefaultResponse<>(message, value, "", "")
                , HttpStatus.OK);
    }


}
