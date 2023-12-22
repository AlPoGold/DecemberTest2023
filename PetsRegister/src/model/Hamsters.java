package model;

import java.time.LocalDate;
import java.util.List;

public class Hamsters extends Pets{
    public Hamsters() {
        super();
    }

    public Hamsters(String name, LocalDate birthDate, List<Command> knownCommands, boolean needCage) {
        super(name, birthDate, knownCommands, needCage);
    }
}
