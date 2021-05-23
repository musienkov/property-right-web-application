package com.example.property_right.service.memory;

import com.example.property_right.model.PropertyRight;
import com.example.property_right.repository.memory.CrudRepository;
import com.example.property_right.repository.memory.RepositoryWrappedCrudService;
import org.springframework.stereotype.Service;

@Service
public class PropertyRightService extends RepositoryWrappedCrudService<PropertyRight, Long> {

    public PropertyRightService(CrudRepository<PropertyRight, Long> repository) {
        super(repository);
    }
}
