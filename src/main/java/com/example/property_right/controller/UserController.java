package com.example.property_right.controller;

import com.example.property_right.model.Car;
import com.example.property_right.model.House;
import com.example.property_right.model.User;
import com.example.property_right.service.jdbc.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userService.save(user);
        User createdUser = userService.findById(user.getId());
        return ResponseEntity.ok().body(createdUser);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.findById(id);
        if (user.getId() == 1) {
            List<Car> cars = new ArrayList<>();
            List<House> houses = new ArrayList<>();
            House house1 = House.builder().id(11L).square(100.1).address("Yangelya 22").build();
            House house2 = House.builder().id(12L).square(100.1).address("Yangelya 23").build();
            houses.add(house1);
            houses.add(house2);
            Car car1 = Car.builder()
                    .id(11L)
                    .model("Model X")
                    .mark("Tesla")
                    .price(100000)
                    .build();
            Car car2 = Car.builder()
                    .id(12L)
                    .model("Benz")
                    .mark("Mercedes")
                    .price(10000)
                    .build();
            Car car3 = Car.builder()
                    .id(13L)
                    .model("Model S")
                    .mark("Tesla")
                    .price(100000)
                    .build();
            cars.add(car1);
            cars.add(car2);
            cars.add(car3);
            user.setCars(cars);
            user.setHouses(houses);
        }
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/deleteById/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id) {
        userService.save(user);
        User updatedUser = userService.findById(id);
        return ResponseEntity.ok().body(updatedUser);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }
}
