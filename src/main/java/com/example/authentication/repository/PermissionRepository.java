package com.example.authentication.repository;

import com.example.authentication.object.entity.Permission;
import com.example.authentication.object.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
