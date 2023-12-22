package model;

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
    Jump("Jump");
    private String command;

    Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
