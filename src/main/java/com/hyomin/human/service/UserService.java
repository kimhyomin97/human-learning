package com.hyomin.human.service;

import com.hyomin.human.dto.User;

import javax.servlet.http.HttpSession;
import java.util.Map;

public interface UserService {
    // CRUD

    // Create // sign-up

    // Read // sign-in
    Map<String, Object> userLogin(User userDto, HttpSession httpSession);

    // Update // user update

    // Delete // user delete
}
