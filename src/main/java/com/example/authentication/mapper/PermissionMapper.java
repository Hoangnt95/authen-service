package com.example.authentication.mapper;

import com.example.authentication.object.dto.request.PermissionRequest;
import com.example.authentication.object.dto.request.RoleRequest;
import com.example.authentication.object.dto.response.PermissionResponse;
import com.example.authentication.object.dto.response.RoleResponse;
import com.example.authentication.object.entity.Permission;
import com.example.authentication.object.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PermissionMapper {

    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
