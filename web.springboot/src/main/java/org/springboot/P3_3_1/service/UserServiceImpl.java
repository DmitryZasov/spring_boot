package org.springboot.P3_3_1.service;


import org.springboot.P3_3_1.dao.UserDAO;
import org.springboot.P3_3_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User readUser(int id) {
        return userDAO.readUser(id);
    }

    @Override
    public void editUserById(User user) {
        userDAO.editUserById(user);
    }

    @Override
    public void removeUserById(int id) {
        userDAO.removeUserById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> readingAllUsers() {
        return userDAO.readingAllUser();
    }
}
