package view.commands;

import view.ConsoleUI;

public class Finish extends Command{

    private String description;
    private ConsoleUI consoleUI;


    public Finish(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "Finish work with file and exit";
    }

    public String getDescription(){
        return description;
    }
    @Override
    public void execute(){
        try {
            System.out.println("This can be error___finish");
//            getConsoleUI().addChildren();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
//TODO before save file !!