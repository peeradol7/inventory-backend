package com.backend_shop.backend_shop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.backend_shop.backend_shop.Entity.UserEntity;
import com.backend_shop.backend_shop.Repository.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository repo;

public UserEntity save(UserEntity userEntity){
    return repo.save(userEntity);
}
public void delete (UserEntity userEntity){
     repo.delete(userEntity);
}
public Optional<UserEntity> findByid(Long user_id){
    return repo.findById(user_id);
}

}
