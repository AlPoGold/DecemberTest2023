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

            getConsoleUI().saveFile();
            getConsoleUI().finish();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
//TODO before save file !!