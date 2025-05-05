package com.example.authentication.exception;

import com.example.authentication.common.ErrorCode;
import com.example.authentication.object.dto.response.BaseResponse;
import com.example.authentication.util.ResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = AppException.class)
    public ResponseEntity<BaseResponse<Void>> handlingAppException(AppException appException) {

        ErrorCode errorCode = appException.getErrorCode();
        return ResponseUtil.error(errorCode);
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<BaseResponse> handlingRuntimeException(RuntimeException runtimeException) {

        BaseResponse response = BaseResponse.error(1001, runtimeException.getMessage());
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<String> handlingMethodArgumentNotValidException(MethodArgumentNotValidException e) {

        return ResponseEntity.badRequest().body(Objects.requireNonNull(e.getFieldError()).getDefaultMessage());
    }
}
