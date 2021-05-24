package com.example.property_right.config.patterns;

import javax.naming.Context;

public class BuyHouse implements State {
    public void doAction(Context context) {
        context.setState(this);
    }

    public List<House> doAction(House house) {
        houses.add(flat);
        return houses;
    }

}

