package com.card.credit.userregistrationservice.service;

import com.card.credit.userregistrationservice.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(String id);

    User getUserByEmail(String email);

    List<User> getAllUsers();


}
