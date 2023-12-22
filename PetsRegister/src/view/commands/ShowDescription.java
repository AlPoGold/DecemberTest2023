package view.commands;

import view.ConsoleUI;

public class ShowDescription extends Command{
    private String description;
    private ConsoleUI consoleUI;
    public ShowDescription(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "Show description about animal";
    }

    public String getDescription(){
        return description;
    }
    @Override
    public void execute(){
        try {
            System.out.println("This can be error___description");
//            getConsoleUI().addChildren();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
