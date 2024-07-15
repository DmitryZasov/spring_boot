package org.springboot.P3_3_1.dao;

import org.springboot.P3_3_1.model.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);

    //User findUser(int id);

    void editUserById (User user);

    void removeUserById(int id);

    List<User> readingAllUser();



    User readUser(int id);
}
