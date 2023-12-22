package view.commands;

import view.ConsoleUI;

import java.io.IOException;

public class AddNewAnimal extends Command{

    private String description;
    private ConsoleUI consoleUI;
    public AddNewAnimal(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "Add new animal to the Register";
    }

    public String getDescription(){
        return description;
    }
    @Override
    public void execute(){
        try {
            System.out.println("This can be error");
//            getConsoleUI().addChildren();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
