package com.example.authentication.object.dto.request;

import com.example.authentication.object.entity.Role;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {

    @Size(min = 3, message = "Username must be at least 3 character.")
    String username;

    String firstName;

    String lastName;

    @Size(min = 8, message = "Pwd must be at least 8 character.")
    String password;

    LocalDate dob;

    Set<Role> roles;
}
