package view.commands;

import view.ConsoleUI;

public class LearnNewCommand extends Command{
    private String description;
    private ConsoleUI consoleUI;
    public LearnNewCommand(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "Learn new command";
    }

    public String getDescription(){
        return description;
    }
    @Override
    public void execute(){
        try {
          getConsoleUI().addNewCommand();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
