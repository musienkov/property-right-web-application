package com.example.property_right.service.jdbc;

import com.example.property_right.model.User;
import com.example.property_right.repository.jdbc.UserDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements GenericService<User> {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User findById(Long id) {
        return userDAO.findById(id);
    }

    @Override
    public void save(User entity) {
        userDAO.save(entity);
    }

    @Override
    public void update(User entity) {
        userDAO.update(entity);
    }

    @Override
    public void deleteById(Long id) {
        userDAO.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
