package model;

import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    private int idAnimal;
    String name;
    LocalDate birthDate;

    List<Command> knownCommands;
    //TODO: команды, как лучше реализовать


    public Animal(String name, LocalDate birthDate, List<Command> knownCommands) {
        this.idAnimal = -1;
        this.name = name;
        this.birthDate = birthDate;
        this.knownCommands = knownCommands;
    }

    public Animal() {
        this(null, null, null);
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<Command> getKnownCommands() {
        return knownCommands;
    }

    public void setId(int id){this.idAnimal = id;}
}
