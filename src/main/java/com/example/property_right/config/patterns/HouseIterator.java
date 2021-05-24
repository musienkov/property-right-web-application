package com.example.property_right.config.patterns;

private class HouseIterator implements Iterator {

    int index;

    @Override
    public boolean hasNext() {

        if (index < houses.length) {
            return true;

        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return houses[index++];
        }
        return null;
    }

    @Override
    public void remove() {
        houses[index] = null;
        index = 0;
    }
}

