package com.example.authentication.object.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity{

    String username;

    String firstName;

    String lastName;

    String password;

    LocalDate dob;

    @OneToMany
    Set<Role> roles;
}
