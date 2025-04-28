package com.example.authentication.mapper;

import com.example.authentication.object.dto.request.UserRequest;
import com.example.authentication.object.dto.response.UserResponse;
import com.example.authentication.object.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserRequest request);

//    @Mapping(target = "password", ignore = true)
//    @Mapping(target = "roles", ignore = true)
    UserResponse toUserResponse(User user);
}
