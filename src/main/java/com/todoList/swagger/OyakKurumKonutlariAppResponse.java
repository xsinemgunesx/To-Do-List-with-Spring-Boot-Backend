package com.todoList.swagger;

import com.todoList.common.DefaultResponse;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;

@Target({ElementType.METHOD, ElementType.TYPE, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {
        @ApiResponse(code = 400, message = "Bad Request", response = DefaultResponse.class),
        @ApiResponse(code = 403, message = "Forbidden", response = DefaultResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = DefaultResponse.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = DefaultResponse.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = DefaultResponse.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = DefaultResponse.class)})
public @interface OyakKurumKonutlariAppResponse {

}
