package view;

import model.Command;
import model.NameClasses;
import presenter.Presenter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

import static model.Command.getListCommands;
import static model.NameClasses.getNameClasses;

public class ConsoleUI implements View{


    private static final String INPUT_ERROR = "WRONG DATA";
    private static final String INPUT_SUCCESS = "ADDING SUCCESSFULLY";
    private static final String DELETE_SUCCESS = "DELETE SUCCESSFULLY";
    private static final String ERROR_OPERATION = "Something is wrong!";
    private static final String SUCCESS_OPERATION = "Operation was finished sucessfully!";
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private Menu menu;
    public ConsoleUI() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
        menu = new Menu(this);
    }

    public void start() {
        System.out.println("**********************************");
        System.out.println("Welcome to ANIMAL REGISTER!");
        System.out.println("**********************************");

        while (work) {
            System.out.println(menu.menu());
            System.out.print("You should choose the action: ");
            String choice = scanner.nextLine();

            try {
                int choiceInt = Integer.parseInt(choice);
                if (choiceInt <= menu.getSize()) menu.execute(choiceInt);
                else errorInput();
            } catch (Exception e) {
                System.out.println(INPUT_ERROR);
            }

        }
    }

    public void finish() {
        System.out.println("*********");
        System.out.println("GOODBYE!");
        System.out.println("*********");
        work = false;
    }

    private void errorInput() {
        System.out.println("You have entered the wrong number! Try again!");
    }



    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }


    public void addAnimal(){
        String name = setName();
        LocalDate birthDate = setBirthDate();
        NameClasses className = setClassName();

        List<Command> knownCommands = setKnownCommands();

        presenter.addAnimal(name, birthDate, className, knownCommands);



    }
//TODO: parse name pets class
    private NameClasses setClassName() {
        NameClasses[] nCl = NameClasses.values();


        for (int i = 0; i < nCl.length; i++) {
            System.out.printf("%d. %s\n", i+1, nCl[i]);
        }
        System.out.println("Insert number of animal's type from the list above\n");
        //TODO register num not in list
        Integer classNameInt = scanner.nextInt();
        NameClasses className = setDefault();
        HashMap<Integer, NameClasses> nameClMap = getNameClasses();
        for (Integer key: nameClMap.keySet()
             ) {
            if(Objects.equals(key, classNameInt)){
                className = nameClMap.get(key);
                break;
            }
        }
        return className;
    }

    private NameClasses setDefault() {
        return NameClasses.valueOf(String.valueOf(NameClasses.cat));
    }

    private List<Command> setKnownCommands(){
        boolean showCommand = true;
        List<Command> knownCommand = new ArrayList<>();
        HashMap<String, Command> checkCommands = getListCommands();
        Command[] commandList = Command.values();
        for (int i = 0; i < commandList.length; i++) {
            System.out.printf("%d. %s\n", i+1, commandList[i]);
        }
        System.out.println("Insert number of command, which animal has known. For exit insert -1: ");

        while(showCommand){

            //TODO check input number
            String command = scanner.nextLine();
            for (String key: checkCommands.keySet()
            ) {
                if (command.equals(key)) {
                    knownCommand.add(checkCommands.get(key));
                    break;
                } else if (command.equals(String.valueOf(-1))) {
                    showCommand = false;
                    break;
                }
            }

        }
        return knownCommand;
    }

    private LocalDate setBirthDate() {
        LocalDate birthDate = null;
        System.out.println("Insert date of birth in format dd.mm.yyyy: ");
        String birthdateString = scanner.nextLine();
        SimpleDateFormat formatBirth = new SimpleDateFormat();
        formatBirth.applyPattern("dd.MM.yyyy");
        try {
            Date birthdate = formatBirth.parse(birthdateString);
            birthDate = convertToLocalDate(birthdate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return birthDate;
    }

    public LocalDate convertToLocalDate(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    private String setName() {
        System.out.println("Insert animal's name: ");
        String name = scanner.nextLine();
        return name;
    }



    public void showDescription() {
        String info = presenter.showDescription();
        printAnswer(info);
    }

    public void saveFile() {
        presenter.saveRegister();
    }

    public void readFile() {
        presenter.readFile();
    }

    public void countAnimals() {
        System.out.print("\nIn Register AMOUNT of animals is: ");
        printAnswer(presenter.countAnimals());
    }

    public void showCommands() {
        HashMap<String, Command> listCommands = getListCommands();
        for (String key: listCommands.keySet()
             ) {
            System.out.print(key + ". " + listCommands.get(key)+ "\n");
        }
    }

    public void deleteAnimal() {
        showDescription();
        System.out.println("Choose id of animal, which you want to delete:");
        int idForDelete = scanner.nextInt();
        if(presenter.deleteById(idForDelete)){
            System.out.println(DELETE_SUCCESS);
        }else System.out.println(ERROR_OPERATION);
    }

    public void addNewCommand() {

        //TODO check numbers
        showDescription();
        System.out.println("Choose id of animal for new command:");
        int id = scanner.nextInt();

        showCommands();
        System.out.println("Choose number of new command: ");
        int numCommand = scanner.nextInt();


        if(presenter.addNewCommand(id, numCommand)){
            printAnswer(SUCCESS_OPERATION);
        }else printAnswer(ERROR_OPERATION);
    }
}
