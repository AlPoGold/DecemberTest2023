package model;

import java.time.LocalDate;
import java.util.List;

public class Camels extends PackAnimal{
    public Camels(String name, LocalDate birthDate, NameClasses className, List<Command> knownCommands) {
        super(name, birthDate, className, knownCommands);
    }

    public Camels() {
    }

    public Camels(String name, LocalDate birthDate, List<Command> knownCommands) {
        super(name, birthDate, knownCommands);
    }
}
