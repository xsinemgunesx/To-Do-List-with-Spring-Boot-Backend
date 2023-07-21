package com.todoList.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DefaultResponse<T> {

    private final String timestamp = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(ZonedDateTime.now().withZoneSameInstant(ZoneId.of("UTC")));
    private String code = "0";
    private String message = "";
    private T data;
    private String path;
    private String remoteIp;

    public DefaultResponse(String message, T data, String path, String remoteIp) {
        this.message = message;
        this.data = data;
        this.path = path;
        this.remoteIp = remoteIp;
    }

    public DefaultResponse(String message, String path, String remoteIp) {
        this.message = message;
        this.path = path;
        this.remoteIp = remoteIp;
    }

    public DefaultResponse(T data, String path, String remoteIp) {
        this.data = data;
        this.path = path;
        this.remoteIp = remoteIp;
    }

}
