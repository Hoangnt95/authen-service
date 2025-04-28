package com.example.authentication.object.dto.response;

import com.example.authentication.object.entity.Permission;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleResponse extends BaseResponse {

    String name;

    String description;

    Set<Permission> permissions;

}
