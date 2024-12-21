package com.backend_shop.backend_shop.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend_shop.backend_shop.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByUsername(String username);
}
