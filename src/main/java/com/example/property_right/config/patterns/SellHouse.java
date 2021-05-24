package com.example.property_right.config.patterns;

public class SellHouse implements Strategy {
    @Override
    public List<House> doOperation(House house) {
        houses.clear();
        houses.add(house);
        return houses;
    }
}
