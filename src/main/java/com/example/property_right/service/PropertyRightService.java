package com.example.property_right.service;

import com.example.property_right.model.PropertyRight;
import com.example.property_right.repository.CrudRepository;
import com.example.property_right.repository.RepositoryWrappedCrudService;
import org.springframework.stereotype.Service;

@Service
public class PropertyRightService extends RepositoryWrappedCrudService<PropertyRight, Long> {

    public PropertyRightService(CrudRepository<PropertyRight, Long> repository) {
        super(repository);
    }
}
