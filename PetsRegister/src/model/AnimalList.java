package model;

import model.Service.Counter;

import java.util.ArrayList;

public class AnimalList implements Counter {

    int lastID;
    int countAnimals;
    ArrayList<Animal> animalList;

    @Override
    public int getCount() {
        return countAnimals;
    }

    @Override
    public int getID() {
        lastID+=1;
        return this.lastID-1;
    }
}
