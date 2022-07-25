package com.astrodust.springsecurity;

import com.astrodust.springsecurity.entity.Role;
import com.astrodust.springsecurity.entity.User;
import com.astrodust.springsecurity.enums.RoleEnum;
import com.astrodust.springsecurity.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringsecurityApplication {
    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserService userService){
        return args -> {
          User user1 = new User("admin", "testAdmin@gmail.com", passwordEncoder.encode("123456"));
          user1.getRoles().add(new Role(RoleEnum.ADMIN));
          User user2 = new User("user", "testUser@gmail.com", passwordEncoder.encode("123456"));
          user2.getRoles().add(new Role(RoleEnum.USER));
          User user3 = new User("moderator", "testMod@gmail.com", passwordEncoder.encode("123456"));
          user3.getRoles().add(new Role(RoleEnum.MODERATOR));
          userService.saveOrUpdate(user1);
          userService.saveOrUpdate(user2);
          userService.saveOrUpdate(user3);
        };
    }

}
