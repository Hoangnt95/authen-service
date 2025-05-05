package com.example.authentication.util;

import com.example.authentication.common.ErrorCode;
import com.example.authentication.object.dto.response.BaseResponse;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {

    public static <T>ResponseEntity<BaseResponse<T>> ok(T data) {
        return ResponseEntity.ok(BaseResponse.success(data));
    }

    public static ResponseEntity<BaseResponse<Void>> ok() {
        return ResponseEntity.ok(BaseResponse.success(null));
    }

    public static <T> ResponseEntity<BaseResponse<T>> error(ErrorCode errorCode) {
        return ResponseEntity
                .status(errorCode.getHttpStatus())
                .body(BaseResponse.error(errorCode));
    }

    public static <T> ResponseEntity<BaseResponse<T>> error(ErrorCode errorCode, String customMessage) {
        BaseResponse<T> response = BaseResponse.error(errorCode.getCode(), errorCode.getMessage());

        return ResponseEntity
                .status(errorCode.getHttpStatus())
                .body(response);
    }

}
