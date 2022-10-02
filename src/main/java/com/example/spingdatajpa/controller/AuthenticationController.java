package com.example.spingdatajpa.controller;

import com.example.spingdatajpa.config.JwtUtil;
import com.example.spingdatajpa.config.UserPrincipal;
import com.example.spingdatajpa.entity.authEntity.Token;
import com.example.spingdatajpa.entity.authEntity.User;
import com.example.spingdatajpa.service.TokenService;
import com.example.spingdatajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    UserService userService;

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    TokenService tokenService;

    @PostMapping("/registry")
    public User registry(@RequestBody User user){
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userService.createUser(user);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user)
    {
        UserPrincipal userPrincipal =
                userService.findByUsername(user.getUsername());

        if (null == user || !new BCryptPasswordEncoder()
                .matches(user.getPassword(), userPrincipal.getPassword())) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Account or password is not valid!");
        }

        Token token = new Token();
        token.setToken(jwtUtil.generateToken(userPrincipal));
        token.setTokenExpDate(jwtUtil.generateExpirationDate());
        token.setCreatedBy(userPrincipal.getUserId());
        tokenService.createToken(token);

        return ResponseEntity.ok(token.getToken());
    }

    @GetMapping("/hello")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity hello()
    {
        return ResponseEntity.ok("hello");
    }

}
