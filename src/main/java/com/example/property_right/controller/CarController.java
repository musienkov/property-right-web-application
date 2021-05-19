package com.example.property_right.controller;

import com.example.property_right.exception.ObjectNotFoundException;
import com.example.property_right.model.Car;
import com.example.property_right.model.User;
import com.example.property_right.repository.base.CrudRepository;
import com.example.property_right.service.CarService;
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

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @PostMapping("/create")
    public ResponseEntity<Car> createUser(@RequestBody Car car) {
        carService.save(new CrudRepository.Pair<>(car.getId(), car));
        Car createdCar;
        try {
            createdCar = carService.findById(car.getId());
        } catch (ObjectNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(createdCar);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Car> getUserById(@PathVariable Long id) {
        Car car;
        try {
            car = carService.findById(id);
        } catch (ObjectNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(car);
    }

    @PostMapping("/deleteById/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Long id) {
        carService.remove(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Car> updateUser(@RequestBody Car car, @PathVariable Long id) {
        carService.save(new CrudRepository.Pair<>(id, car));
        Car updatedCar;
        try {
            updatedCar = carService.findById(id);
        } catch (ObjectNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(updatedCar);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Car>> getAll() {
        return ResponseEntity.ok().body(carService.findAll());
    }
}
