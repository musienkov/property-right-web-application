package com.example.property_right.repository.memory;

import com.example.property_right.model.Car;
import com.example.property_right.repository.memory.InMemoryCrudRepository;
import org.springframework.stereotype.Component;

@Component
public class CarRepository extends InMemoryCrudRepository<Car, Long> {
}
