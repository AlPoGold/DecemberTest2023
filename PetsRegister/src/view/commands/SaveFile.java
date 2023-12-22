package view.commands;

import view.ConsoleUI;

import java.io.IOException;

public class SaveFile extends Command{

    private String description;
    private ConsoleUI consoleUI;
    public SaveFile(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "Save file";
    }

    public String getDescription(){
        return description;
    }
    @Override
    public void execute(){
        try {
            System.out.println("This can be error---savefile");
//            getConsoleUI().addChildren();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
