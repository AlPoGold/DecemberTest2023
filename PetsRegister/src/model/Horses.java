package model;

import java.time.LocalDate;
import java.util.List;

public class Horses extends PackAnimal{
    public Horses(String name, LocalDate birthDate, List<Command> knownCommands, Double cargoWeight) {
        super(name, birthDate, knownCommands, cargoWeight);
    }

    public Horses() {
        super();
    }

    public Horses(String name, LocalDate birthDate, List<Command> knownCommands) {
        super(name, birthDate, knownCommands);
    }
}
