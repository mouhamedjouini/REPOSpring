package com.example.projet_car_location.service;

import com.example.projet_car_location.entities.Role;
import com.example.projet_car_location.entities.User;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
}
