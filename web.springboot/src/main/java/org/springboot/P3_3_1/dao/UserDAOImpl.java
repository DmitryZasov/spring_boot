package org.springboot.P3_3_1.dao;


import org.springboot.P3_3_1.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    private EntityManager em;

    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public void addUser(User user) {
        em.persist(user);
    }
    @Override
    public User readUser(int id) {
        return em.find(User.class, id);
    }


    @Override
    public void editUserById(User user) {
        em.merge(user);
    }

    @Override
    public void removeUserById(int id) {
        User user = em.find(User.class, id);
        em.remove(user);
    }

    @Override
    public List<User> readingAllUser() {
        return em.createQuery("from User", User.class).getResultList();
    }



}
