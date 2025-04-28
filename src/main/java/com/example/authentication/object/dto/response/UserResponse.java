package com.example.authentication.object.dto.response;

import com.example.authentication.object.entity.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse{

    String username;

    String firstName;

    String lastName;

    String password;

    LocalDate dob;

    Set<Role> roles;
}
