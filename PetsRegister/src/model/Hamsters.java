package model;

import java.time.LocalDate;
import java.util.List;

public class Hamsters extends Pets{
    public Hamsters(String name, LocalDate birthDate, NameClasses className, List<Command> knownCommands) {
        super(name, birthDate, className, knownCommands);
    }



    public Hamsters(String name, LocalDate birthDate, List<Command> knownCommands) {
        super(name, birthDate, knownCommands);
    }
}
