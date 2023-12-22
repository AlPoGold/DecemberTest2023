package model;

import java.time.LocalDate;
import java.util.List;

public class Camels extends PackAnimal{
    public Camels(String name, LocalDate birthDate, List<Command> knownCommands, Double cargoWeight) {
        super(name, birthDate, knownCommands, cargoWeight);
    }

    public Camels() {
    }
}
