package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static model.Command.getCommandByNum;
import static model.NameClasses.cat;

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


    public void addAnimal(String name, LocalDate birthDate, NameClasses className, List<Command> knownCommands) {
        int id = getID();
        switch (className){
            case cat:
                Animal cat = new Cats(name, birthDate, className, knownCommands);
                cat.setId(id);
                animalList.add(cat);
                increaseCount();
                break;
            case dog:
                Animal dog = new Dogs(name, birthDate,className, knownCommands);
                dog.setId(id);
                animalList.add(dog);
                increaseCount();
                break;
            case hamster:
                Animal hamster = new Hamsters(name, birthDate, className, knownCommands);
                animalList.add(hamster);
                hamster.setId(id);
                increaseCount();
                break;
            case horse:
                Animal horse = new Horses(name, birthDate, className, knownCommands);
                horse.setId(id);
                animalList.add(horse);
                increaseCount();
                break;
            case donkey:
                Animal donkey = new Donkies(name, birthDate, className, knownCommands);
                donkey.setId(id);
                animalList.add(donkey);
                increaseCount();
                break;
            case camel:
                Animal camel = new Camels(name, birthDate, className, knownCommands);
                camel.setId(id);
                animalList.add(camel);
                increaseCount();
                break;
        }
    }

    private void increaseCount() {
        this.countAnimals+=1;
    }

    public boolean deleteById(int idForDelete) {
        boolean success = false;
        int index = searchById(idForDelete);
        if(index!=-1){
            animalList.remove(index);
            decreaseCount();
            success=true;
        }
        return success;
    }

    private void decreaseCount() {
        this.countAnimals-=1;
    }

    public int searchById(int idForDelete) {
        int index = -1;
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            if(animal.getId()==idForDelete) index = i;

        }
        return index;
    }

    public boolean addNewCommand(int id, int numCommand) {
        boolean success = false;
        int index = searchById(id);
        Animal animal = animalList.get(index);
        Command newCommand = getCommandByNum(numCommand);
        if (newCommand!=null){
            animal.knownCommands.add(newCommand);
            success=true;
        }
        return  success;
    }
}
