package com.example.authentication.controller;

import com.example.authentication.object.dto.request.UserRequest;
import com.example.authentication.object.dto.response.BaseResponse;
import com.example.authentication.object.dto.response.UserResponse;
import com.example.authentication.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/add-user")
    public ResponseEntity<UserResponse> createUser(@RequestBody @Valid UserRequest request) {

        UserResponse response = userService.createUser(request);
        return ResponseEntity.ok(response);
    }

}
