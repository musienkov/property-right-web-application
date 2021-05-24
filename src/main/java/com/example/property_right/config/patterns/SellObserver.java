package com.example.property_right.config.patterns;

public class SellObserver extends Observer {
    public SellObserver(Inhabitant inhabitant) {
        this.inhabitant = inhabitant;
        this.inhabitant.attach(this);
    }

    @Override
    public void update() {
        inhabitantService.update();
    }

}

