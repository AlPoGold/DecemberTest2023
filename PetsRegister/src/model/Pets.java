package model;

import java.time.LocalDate;
import java.util.List;

public abstract class Pets extends Animal{



    public Pets() {
        super();
    }

    public Pets(String name, LocalDate birthDate, NameClasses className, List<Command> knownCommands) {
        super(name, birthDate, className, knownCommands);

    }

    public Pets(String name, LocalDate birthDate, List<Command> knownCommands) {
        super(name, birthDate, knownCommands);
    }
}
