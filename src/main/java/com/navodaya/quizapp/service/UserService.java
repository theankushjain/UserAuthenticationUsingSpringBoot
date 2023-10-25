package com.navodaya.quizapp.service;

import com.navodaya.quizapp.dto.UserDto;
import com.navodaya.quizapp.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
