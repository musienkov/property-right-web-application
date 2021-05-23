package com.example.property_right.controller;

import com.example.property_right.model.Car;
import com.example.property_right.service.jdbc.CarServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @PostMapping("/create")
    public ResponseEntity<Car> createUser(@RequestBody Car car) {
        carService.save(car);
        Car createdCar;
        createdCar = carService.findById(car.getId());
        return ResponseEntity.ok().body(createdCar);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Car> getUserById(@PathVariable Long id) {
        Car car;
        car = carService.findById(id);
        return ResponseEntity.ok().body(car);
    }

    @PostMapping("/deleteById/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Long id) {
        carService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Car> updateUser(@RequestBody Car car, @PathVariable Long id) {
        carService.update(car);
        Car updatedCar;
        updatedCar = carService.findById(id);
        return ResponseEntity.ok().body(updatedCar);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Car>> getAll() {
        return ResponseEntity.ok().body(carService.findAll());
    }
}
