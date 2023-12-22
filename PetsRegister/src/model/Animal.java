package model;

import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    String name;
    LocalDate birthDate;

    List<Command> knownCommands;
    //TODO: команды, как лучше реализовать


    public Animal(String name, LocalDate birthDate, List<Command> knownCommands) {
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
}
