package view.commands;

import view.ConsoleUI;

public class SortByName extends Command{
    private String description;
    private ConsoleUI consoleUI;
    public SortByName(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "Sorting animals by name";
    }

    public String getDescription(){
        return description;
    }
    @Override
    public void execute(){
        try {
            System.out.println("This can be error----sort by name");
//            getConsoleUI().addChildren();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
