package com.astrodust.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/tests")
public class TestController {

    @GetMapping(value = "/")
    public String getAll(){
        return "Public Content";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAuthority('USER') or hasAuthority('MODERATOR') or hasAuthority('ADMIN')")
    public String userAccess() {
        return "User Content";
    }

    @GetMapping("/mod")
    @PreAuthorize("hasAuthority('MODERATOR')")
    public String moderatorAccess() {
        return "Moderator Board";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String adminAccess() {
        return "Admin Board";
    }
}
