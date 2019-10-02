package com.akajava.springrest.service;

import java.util.List;

import com.akajava.springrest.model.User;

public interface UserService {

    void deleteAllUsers();

    void deleteUserById(long id);

    User findById(long id);

    void updateUser(User currentUser);

    List<User> findAllUsers();

    boolean isUserExist(User user);

    void saveUser(User user);

}
