package view.commands;

import view.ConsoleUI;

public class ShowListAnimal extends Command{
    private String description;
    private ConsoleUI consoleUI;
    public ShowListAnimal(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "Show list of  animals";
    }

    public String getDescription(){
        return description;
    }
    @Override
    public void execute(){
        try {
            getConsoleUI().showDescription();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
