package model;

import java.time.LocalDate;
import java.util.List;

public class Cats extends Pets{

    public Cats() {
        super();
    }

    public Cats(String name, LocalDate birthDate, List<Command> knownCommands, boolean needCage) {
        super(name, birthDate, knownCommands, needCage);
    }

    public Cats(String name, LocalDate birthDate, List<Command> knownCommands) {
        super(name, birthDate, knownCommands);
    }
}
