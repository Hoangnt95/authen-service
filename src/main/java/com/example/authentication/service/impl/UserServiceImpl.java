package com.example.authentication.service.impl;

import com.example.authentication.mapper.UserMapper;
import com.example.authentication.object.dto.request.UserRequest;
import com.example.authentication.object.dto.response.BaseResponse;
import com.example.authentication.object.dto.response.UserResponse;
import com.example.authentication.object.entity.User;
import com.example.authentication.repository.UserRepository;
import com.example.authentication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponse createUser(UserRequest request) {
        User user = userMapper.toUser(request);
        UserResponse response = userMapper.toUserResponse(userRepository.save(user));

        return BaseResponse.success(response);
    }

    @Override
    public UserResponse getUserByUserName(String userName) {
        UserResponse userResponse = userMapper.toUserResponse(userRepository.findUserByUsername(userName));

        return BaseResponse.success(userResponse);
    }
}
