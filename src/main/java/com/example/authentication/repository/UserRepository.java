package com.example.authentication.repository;

import com.example.authentication.object.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String userName);
    boolean existsByUsername(String username);
}
