package model;

import java.util.HashMap;

public enum Command {

    Sit("Sit"),
    LieDown("Lie down"),
    Stop("Stop"),
    ComeToMe("Come when called"),
    Fu("Refusal of unwanted behavior"),
    Voice("Barking on command"),
    Quiet("Stop barking"),
    Fetch("Bring an item"),
    Stay("Stay at current place"),
    Roll("Rolling body"),
    Hide("Hide in some place"),
    Pounce("Attack the target"),
    Paw("Give the paw"),
    Spin("Spin something"),
    Scratch("Make scratches"),
    Meow("Say meow"),
    Jump("Jump"),
    Run("Run"),
    Kick("Kick"),
    CarryLoad("Carry heavy cargo"),
    Gallop("Gallop"),
    Walk("Walk");
    private String command;

    Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public static HashMap<String, Command> getListCommands(){
        HashMap<String, Command> mapCommands = new HashMap<>();
        Command[] commandList = Command.values();
        for (int i = 0; i < commandList.length ; i++) {
            mapCommands.put(String.valueOf(i+1), commandList[i]);
        }
        return mapCommands;
    }

    public static Command getCommandByNum(int num){
        Command newCommand = null;
        HashMap<String, Command> mapCommands = getListCommands();
        for (String key: mapCommands.keySet()
             ) {
            if(key.equals(String.valueOf(num))){
                newCommand = mapCommands.get(key);
            }
        }
    return newCommand;
    }

}
