package com.example.spingdatajpa.service;


import com.example.spingdatajpa.entity.authEntity.Token;

public interface TokenService {

    Token createToken(Token token);

    Token findByToken(String token);
}
