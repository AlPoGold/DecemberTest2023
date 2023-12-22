package model;

import java.time.LocalDate;
import java.util.List;

public abstract class PackAnimal extends Animal{

    Double cargoWeight;

    public PackAnimal(String name, LocalDate birthDate, List<Command> knownCommands, Double cargoWeight) {
        super(name, birthDate, knownCommands);
        this.cargoWeight = cargoWeight;
    }

    public PackAnimal() {
        super();
        this.cargoWeight = null;
    }

    public void transportCargo(){
        System.out.printf("I can transport cargo with weight %f kg\n", this.cargoWeight);
    }
}
