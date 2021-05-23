package com.example.property_right.service.jdbc;

import com.example.property_right.model.House;
import com.example.property_right.repository.jdbc.HouseDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements GenericService<House> {

    private final HouseDAO houseDAO;

    public HouseServiceImpl(HouseDAO houseDAO) {
        this.houseDAO = houseDAO;
    }

    @Override
    public House findById(Long id) {
        return houseDAO.findById(id);
    }

    @Override
    public void save(House entity) {
        houseDAO.save(entity);
    }

    @Override
    public void update(House entity) {
        houseDAO.update(entity);
    }

    @Override
    public void deleteById(Long id) {
        houseDAO.deleteById(id);
    }

    @Override
    public List<House> findAll() {
        return houseDAO.findAll();
    }
}
