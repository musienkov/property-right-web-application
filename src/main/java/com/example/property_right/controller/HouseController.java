package com.example.property_right.controller;

import com.example.property_right.model.House;
import com.example.property_right.service.jdbc.HouseServiceImpl;
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
@RequestMapping("/houses")
public class HouseController {

    private final HouseServiceImpl houseService;

    public HouseController(HouseServiceImpl houseService) {
        this.houseService = houseService;
    }


    @PostMapping("/create")
    public ResponseEntity<House> createUser(@RequestBody House house) {
        houseService.save(house);
        House createdHouse;
        createdHouse = houseService.findById(house.getId());
        return ResponseEntity.ok().body(createdHouse);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<House> getUserById(@PathVariable Long id) {
        House house;
        house = houseService.findById(id);
        return ResponseEntity.ok().body(house);
    }

    @PostMapping("/deleteById/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Long id) {
        houseService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<House> updateUser(@RequestBody House house, @PathVariable Long id) {
        houseService.save(house);
        House updatedHouse = houseService.findById(id);
        return ResponseEntity.ok().body(updatedHouse);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<House>> getAll() {
        return ResponseEntity.ok().body(houseService.findAll());
    }

}
