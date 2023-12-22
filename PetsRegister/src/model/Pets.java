package model;

import java.time.LocalDate;
import java.util.List;

public abstract class Pets extends Animal{

    boolean needCage;

    public Pets() {
        super();
        this.needCage = false;
    }

    public Pets(String name, LocalDate birthDate, List<Command> knownCommands, boolean needCage) {
        super(name, birthDate, knownCommands);
        this.needCage = needCage;
    }
}
