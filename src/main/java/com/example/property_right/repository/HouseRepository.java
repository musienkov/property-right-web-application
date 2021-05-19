package com.example.property_right.repository;

import com.example.property_right.model.House;
import com.example.property_right.repository.base.InMemoryCrudRepository;
import org.springframework.stereotype.Component;

@Component
public class HouseRepository extends InMemoryCrudRepository<House, Long> {
}
