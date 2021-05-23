package com.example.property_right.repository.jpa;

import com.example.property_right.model.jpa.entity.PropertyRightEntity;
import org.springframework.data.repository.CrudRepository;

public interface PropertyRightRepositoryJPA extends CrudRepository<PropertyRightEntity, Long> {
}
