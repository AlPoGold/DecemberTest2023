package view.commands;

import view.ConsoleUI;

public class ShowCommands extends Command{
    private String description;
    private ConsoleUI consoleUI;
    public ShowCommands(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "Show commands, which animals can learn";
    }

    public String getDescription(){
        return description;
    }
    @Override
    public void execute(){
        try {
            getConsoleUI().showCommands();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
