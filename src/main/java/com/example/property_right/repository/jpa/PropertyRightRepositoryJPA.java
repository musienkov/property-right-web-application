package com.example.property_right.repository.jpa;

import com.example.property_right.model.jpa.entity.PropertyRightEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRightRepositoryJPA extends CrudRepository<PropertyRightEntity, Long> {
}
