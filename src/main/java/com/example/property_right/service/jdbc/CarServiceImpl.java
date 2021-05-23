package com.example.property_right.service.jdbc;

import com.example.property_right.model.Car;
import com.example.property_right.repository.jdbc.CarDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements GenericService<Car> {

    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public Car findById(Long id) {
        return carDAO.findById(id);
    }

    @Override
    public void save(Car entity) {
        carDAO.save(entity);
    }

    @Override
    public void update(Car entity) {
        carDAO.update(entity);
    }

    @Override
    public void deleteById(Long id) {
        carDAO.deleteById(id);
    }

    @Override
    public List<Car> findAll() {
        return carDAO.findAll();
    }
}
