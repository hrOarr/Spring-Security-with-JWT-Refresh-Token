package com.astrodust.springsecurity.repository;

import com.astrodust.springsecurity.entity.RefreshToken;
import com.astrodust.springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Integer> {
    Optional<RefreshToken> findByToken(@Param("token") String token);
    void deleteByUser(@Param("user") Optional<User> user);
}
