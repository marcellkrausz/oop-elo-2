package com.codecool.farm.animal;

public class Cattle extends Animal {

    @Override
    public void feed() {
      this.size += 2;
    }

    @Override
    public String toString() {
        return "There is a " + this.size + " sized cattle in the farm.";
    }
}
