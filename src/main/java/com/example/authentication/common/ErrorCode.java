package com.example.authentication.common;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    //4xx
    USER_EXISTS(HttpStatus.BAD_REQUEST, "User already exists"),
    NOT_FOUND(HttpStatus.NOT_FOUND, "Not found"),
    ;

    private final HttpStatus httpStatus;

    private final String message;

    ErrorCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public int getCode() {
        return httpStatus.value();
    }
}
