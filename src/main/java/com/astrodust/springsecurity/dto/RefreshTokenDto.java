package com.astrodust.springsecurity.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class RefreshTokenDto {
    @NotBlank
    private String refreshToken;
    private String accessToken;
    private String type = "Bearer";
}
