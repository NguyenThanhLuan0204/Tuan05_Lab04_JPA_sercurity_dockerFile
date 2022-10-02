package com.example.spingdatajpa.repository.authReponsitory;


import com.example.spingdatajpa.entity.authEntity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {

    Token findByToken(String token);
}
