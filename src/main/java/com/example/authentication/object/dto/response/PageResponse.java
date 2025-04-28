package com.example.authentication.object.dto.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PageResponse<T> extends BaseResponse {

    int page; //Trang hien tai

    int size; //Kich thuoc trang

    Long totalElement; //Tong so phan tu

    List<T> contents; //Du lieu cua trang hien tai
}
