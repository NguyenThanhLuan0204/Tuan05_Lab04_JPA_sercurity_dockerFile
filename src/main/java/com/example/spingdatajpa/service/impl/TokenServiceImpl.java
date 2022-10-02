package com.example.spingdatajpa.service.impl;

import com.example.spingdatajpa.entity.authEntity.Token;
import com.example.spingdatajpa.repository.authReponsitory.TokenRepository;
import com.example.spingdatajpa.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}
