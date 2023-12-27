package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalList implements Iterable<Animal>, Serializable {

    private int lastID;
    private int countAnimals;
    ArrayList<Animal> animalList;

    public AnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
        countAnimals = animalList.size();
        lastID = animalList.size()-1;
    }

    public AnimalList() {
        animalList = new ArrayList<>();
        countAnimals = 0;
        lastID = 1;
    }


    public int getCount() {
        return countAnimals;
    }


    public int getID() {
        lastID+=1;
//        countAnimals+=1;
        return this.lastID-1;
    }

    public String getAnimalList(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("List of animals:\n");

        for (Animal animal: animalList){
            stringBuilder.append(animal);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }



    @Override
    public Iterator<Animal> iterator() {
        return animalList.iterator();
    }


    public void addAnimal(String name, LocalDate birthDate, String className, List<Command> knownCommands) {
        int id = getID();
        switch (className){
            case "1":
                Animal cat = new Cats(name, birthDate, knownCommands);
                cat.setId(id);
                animalList.add(cat);
                increaseCount();
                break;
            case "2":
                Animal dog = new Dogs(name, birthDate, knownCommands);
                dog.setId(id);
                animalList.add(dog);
                increaseCount();
                break;
            case "3":
                Animal hamster = new Hamsters(name, birthDate, knownCommands);
                animalList.add(hamster);
                hamster.setId(id);
                increaseCount();
                break;
            case "4":
                Animal horse = new Horses(name, birthDate, knownCommands);
                horse.setId(id);
                animalList.add(horse);
                increaseCount();
                break;
            case "5":
                Animal donkey = new Donkies(name, birthDate, knownCommands);
                donkey.setId(id);
                animalList.add(donkey);
                increaseCount();
                break;
            case "6":
                Animal camel = new Camels(name, birthDate, knownCommands);
                camel.setId(id);
                animalList.add(camel);
                increaseCount();
                break;
        }
    }

    private void increaseCount() {
        this.countAnimals+=1;
    }
}
