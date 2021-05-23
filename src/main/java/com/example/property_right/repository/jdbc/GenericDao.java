package com.example.property_right.repository.jdbc;

import java.util.List;

public interface GenericDao<T>{
    T findById(Long id);
    void save(T entity);
    void update(T entity);
    void deleteById(Long id);
    List<T> findAll();
    int countAll();
}

