package com.example.property_right.repository;

import com.example.property_right.model.Car;
import org.springframework.stereotype.Component;

@Component
public class CarRepository extends InMemoryCrudRepository<Car, Long> {
}
