package com.example.property_right.controller;

import com.example.property_right.exception.ObjectNotFoundException;
import com.example.property_right.model.House;
import com.example.property_right.repository.CrudRepository;
import com.example.property_right.service.HouseService;
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

    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }


    @PostMapping("/create")
    public ResponseEntity<House> createUser(@RequestBody House house) {
        houseService.save(new CrudRepository.Pair<>(house.getId(), house));
        House createdHouse;
        try {
            createdHouse = houseService.findById(house.getId());
        } catch (ObjectNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(createdHouse);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<House> getUserById(@PathVariable Long id) {
        House house;
        try {
            house = houseService.findById(id);
        } catch (ObjectNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(house);
    }

    @PostMapping("/deleteById/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Long id) {
        houseService.remove(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<House> updateUser(@RequestBody House house, @PathVariable Long id) {
        houseService.save(new CrudRepository.Pair<>(id, house));
        House updatedHouse;
        try {
            updatedHouse = houseService.findById(id);
        } catch (ObjectNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(updatedHouse);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<House>> getAll() {
        return ResponseEntity.ok().body(houseService.findAll());
    }

}
