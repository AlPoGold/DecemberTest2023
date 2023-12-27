package view.commands;

import view.ConsoleUI;

public class CountAnimals extends Command{
    private String description;
    private ConsoleUI consoleUI;
    public CountAnimals(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "Count animals, which were added to the register";
    }

    public String getDescription(){
        return description;
    }
    @Override
    public void execute(){
        try {
            getConsoleUI().countAnimals();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
