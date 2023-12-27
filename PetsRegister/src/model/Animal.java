package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public abstract class Animal implements Serializable {
    private int idAnimal;
    String name;
    LocalDate birthDate;
    NameClasses className;
    List<Command> knownCommands;
    //TODO: команды, как лучше реализовать


    public Animal(String name, LocalDate birthDate, NameClasses className, List<Command> knownCommands) {
        this.idAnimal = -1;
        this.name = name;
        this.birthDate = birthDate;
        this.className = className;
        this.knownCommands = knownCommands;
    }

    public Animal() {
        this(null, null, null, null);
    }

    public Animal(String name, LocalDate birthDate, List<Command> knownCommands) {
        this.name = name;
        this.birthDate = birthDate;
        this.knownCommands = knownCommands;
    }


    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<Command> getKnownCommands() {
        return knownCommands;
    }

    public void setId(int id){this.idAnimal = id;}
    public void setNameClass(NameClasses nameClass){
        this.className = nameClass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < knownCommands.size(); i++) {
            if(i<knownCommands.size()-1){
                sb.append(knownCommands.get(i));
                sb.append(", ");
            }else{
                sb.append(knownCommands.get(i));
            }


        }
        return
                "id:" + idAnimal +
                "| name: " + name +
                "| birthDate: " + birthDate +
                "| class: " + className +
                "| knownCommands: " + sb.toString();
    }

    public int getId() {
        return this.idAnimal;
    }
}
