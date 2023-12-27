package view;

import view.commands.*;

import java.io.IOException;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Command> commandList;

    public Menu(ConsoleUI consoleUI) {
        commandList = new ArrayList<>();
        commandList.add(new ReadFile(consoleUI));
        commandList.add(new AddNewAnimal(consoleUI));
        commandList.add(new CountAnimals(consoleUI));
        commandList.add(new DeleteAnimal(consoleUI));
        commandList.add(new LearnNewCommand(consoleUI));
        commandList.add(new ShowListAnimal(consoleUI));
        commandList.add(new ShowCommands(consoleUI));
        commandList.add(new SaveFile(consoleUI));
        commandList.add(new Finish(consoleUI));
    }

    public String menu(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            sb.append(i+1);
            sb.append(". ");
            sb.append(commandList.get(i).getDescription());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void execute(int choice){
        Command command = commandList.get(choice-1);
        try {
            command.execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public int getSize(){
        return commandList.size();
    }


}
