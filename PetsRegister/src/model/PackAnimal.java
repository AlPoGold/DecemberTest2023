package model;

import java.time.LocalDate;
import java.util.List;

public abstract class PackAnimal extends Animal {


    public PackAnimal(String name, LocalDate birthDate, NameClasses className, List<Command> knownCommands) {
        super(name, birthDate, className, knownCommands);
    }

    public PackAnimal() {
        super();

    }

    public PackAnimal(String name, LocalDate birthDate, List<Command> knownCommands) {
        super(name, birthDate, knownCommands);
    }
}

