package view.commands;

import view.ConsoleUI;

public class ReadFile extends Command{


    private String description;
    private ConsoleUI consoleUI;

    public ReadFile(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "Read existing file";
    }

    public String getDescription(){
        return description;
    }
    @Override
    public void execute(){
        try {
            getConsoleUI().readFile();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
