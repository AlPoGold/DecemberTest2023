package view.commands;

import view.ConsoleUI;

public class DeleteAnimal extends Command{
    private String description;
    private ConsoleUI consoleUI;
    public DeleteAnimal(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "Delete animal";
    }

    public String getDescription(){
        return description;
    }
    @Override
    public void execute(){
        try {
           getConsoleUI().deleteAnimal();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
