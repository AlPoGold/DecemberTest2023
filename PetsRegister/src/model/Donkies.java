package model;

import java.time.LocalDate;
import java.util.List;

public class Donkies extends PackAnimal{
    public Donkies(String name, LocalDate birthDate, NameClasses nameClass, List<Command> knownCommands) {
        super(name, birthDate, nameClass, knownCommands);
    }

    public Donkies() {
        super();
    }

    public Donkies(String name, LocalDate birthDate, List<Command> knownCommands) {
        super(name, birthDate, knownCommands);
    }
}
