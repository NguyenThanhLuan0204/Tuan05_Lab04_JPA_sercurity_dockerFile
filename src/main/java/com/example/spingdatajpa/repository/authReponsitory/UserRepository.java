package com.example.spingdatajpa.repository.authReponsitory;


import com.example.spingdatajpa.entity.authEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
