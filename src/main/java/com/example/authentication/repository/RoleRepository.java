package com.example.authentication.repository;

import com.example.authentication.object.entity.Role;
import com.example.authentication.object.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
