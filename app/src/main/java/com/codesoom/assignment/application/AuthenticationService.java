package com.codesoom.assignment.application;

import com.codesoom.assignment.utils.JwtUtil;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final JwtUtil jwtUtil;

    public AuthenticationService(final JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public String login() {
        return jwtUtil.encode(1L);
    }

    public Long parseToken(String accessToken) {
        return null;
    }
}
