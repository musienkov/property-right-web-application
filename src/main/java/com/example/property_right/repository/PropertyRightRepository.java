package com.example.property_right.repository;

import com.example.property_right.model.PropertyRight;
import com.example.property_right.repository.base.InMemoryCrudRepository;
import org.springframework.stereotype.Component;

@Component
public class PropertyRightRepository extends InMemoryCrudRepository<PropertyRight, Long> {
}
