package model;

import java.time.LocalDate;
import java.util.List;

public class Dogs extends Pets{
    public Dogs() {
        super();
    }

    public Dogs(String name, LocalDate birthDate, List<Command> knownCommands, boolean needCage) {
        super(name, birthDate, knownCommands, needCage);
    }

    public Dogs(String name, LocalDate birthDate, List<Command> knownCommands) {
        super(name, birthDate, knownCommands);
    }
}
