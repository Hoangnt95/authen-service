package com.example.authentication.service;

import com.example.authentication.object.dto.request.UserRequest;
import com.example.authentication.object.dto.response.UserResponse;

public interface UserService {

    UserResponse createUser(UserRequest request);

    UserResponse getUserByUserName(String userName);
}
