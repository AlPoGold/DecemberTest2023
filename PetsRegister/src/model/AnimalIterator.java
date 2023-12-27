package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalIterator<Animal extends model.Animal> implements Iterator<model.Animal> {
    private int index;
    private ArrayList<Animal> animalList;

    public AnimalIterator(List<Animal> animalList){
        this.animalList = (ArrayList<Animal>) animalList;
    }

    @Override
    public boolean hasNext() {
        return animalList.size()>index;
    }

    @Override
    public Animal next() {
        return animalList.get(index++);
    }

}
