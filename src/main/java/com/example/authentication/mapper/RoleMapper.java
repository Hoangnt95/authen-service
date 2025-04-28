package com.example.authentication.mapper;

import com.example.authentication.object.dto.request.RoleRequest;
import com.example.authentication.object.dto.request.UserRequest;
import com.example.authentication.object.dto.response.RoleResponse;
import com.example.authentication.object.dto.response.UserResponse;
import com.example.authentication.object.entity.Role;
import com.example.authentication.object.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    Role toRole(RoleRequest request);

//    @Mapping(target = "permissions", ignore = true)
    RoleResponse toRoleResponse(Role role);
}
