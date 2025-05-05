package com.example.authentication.object.dto.response;

import com.example.authentication.common.ErrorCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse<T> {

    int statusCode;

    String message;

    LocalDateTime timestamp = LocalDateTime.now();

    T data;


    public BaseResponse(int status, String message, T data) {
        this.statusCode = status;
        this.message = message;
        this.data = data;
    }

    public BaseResponse(int status, String message) {
        this.statusCode = status;
        this.message = message;
    }


    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(HttpStatus.OK.value(), "Success", data);
    }

    public static <T> BaseResponse<T> error(int status, String message) {
        return new BaseResponse<>(status, message);
    }

    public static <T> BaseResponse<T> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode.getCode(), errorCode.getMessage(), null);
    }

}
