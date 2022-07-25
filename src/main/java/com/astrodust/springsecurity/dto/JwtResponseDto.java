package com.astrodust.springsecurity.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class JwtResponseDto {
    private String type = "Bearer";
    private String username;
    private String accessToken;
    private String refreshToken;
    private String email;
    private List<String> roles;
}
