package com.card.credit.userregistrationservice.service;

import com.card.credit.userregistrationservice.entity.User;
import com.card.credit.userregistrationservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService  {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;


    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }
}
