package com.backend_shop.backend_shop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend_shop.backend_shop.service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    UserService userService;

    
}
