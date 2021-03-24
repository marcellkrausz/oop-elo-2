package com.codecool.farm.animal;

public class Pig extends Animal {

    @Override
    public void feed() {
        this.size += 1;
    }

    @Override
    public String toString() {
        return "There is a " + this.size + " sized pig in the farm.";
    }
}
