package com.example.property_right.config.patterns;

public class RemoveHouse implements Strategy {
    @Override
    public List<House> doOperation(House house) {
        houses.remove(house);
        return houses;
    }
}

