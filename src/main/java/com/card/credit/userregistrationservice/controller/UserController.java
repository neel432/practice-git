package com.card.credit.userregistrationservice.controller;

import com.card.credit.userregistrationservice.entity.User;
import com.card.credit.userregistrationservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

}
