package com.todoList.common;

public class ServiceResult<E> {
    private E data;
    private int code = 999;
    private String message = "";

    public ServiceResult() {
    }

    public ServiceResult(E data, String message) {
        this.data = data;
        this.message = message;
    }

    public ServiceResult(E data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public ServiceResult(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public ServiceResult(E data, int code) {
        this.data = data;
        this.code = code;
    }

    public ServiceResult(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return code == 999;
    }
}