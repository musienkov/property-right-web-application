package com.example.property_right.service.jdbc;

import com.example.property_right.model.PropertyRight;
import com.example.property_right.repository.jdbc.PropertyRightDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyRightServiceImpl implements GenericService<PropertyRight> {

    private final PropertyRightDAO propertyRightDAO;

    public PropertyRightServiceImpl(PropertyRightDAO propertyRightDAO) {
        this.propertyRightDAO = propertyRightDAO;
    }

    @Override
    public PropertyRight findById(Long id) {
        return propertyRightDAO.findById(id);
    }

    @Override
    public void save(PropertyRight entity) {
        propertyRightDAO.save(entity);
    }

    @Override
    public void update(PropertyRight entity) {
        propertyRightDAO.update(entity);
    }

    @Override
    public void deleteById(Long id) {
        propertyRightDAO.deleteById(id);
    }

    @Override
    public List<PropertyRight> findAll() {
        return propertyRightDAO.findAll();
    }
}
