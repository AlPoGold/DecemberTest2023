package view.commands;

import view.ConsoleUI;

public class ShowKnownCommands extends Command{
    private String description;
    private ConsoleUI consoleUI;
    public ShowKnownCommands(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "Show commands, which animals can learn";
    }

    public String getDescription(){
        return description;
    }
    @Override
    public void execute(){
        try {
            System.out.println("This can be ___show commands");
//            getConsoleUI().addChildren();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
