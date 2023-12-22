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
            System.out.println("This can be error___new_command");
//            getConsoleUI().addChildren();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
