package view;

import model.Command;
import presenter.Presenter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI implements View{


    private static final String INPUT_ERROR = "WRONG DATA";
    private static final String INPUT_SUCCESS = "ADDING SUCCESSFULLY";
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
        String className = setClassName();

        List<Command> knownCommands = null;

        presenter.addAnimal(name, birthDate, className, knownCommands);



    }
//TODO: распарсить данные о классе
    private String setClassName() {
        System.out.println("1.cat\n2.dog\n3.humster\n4.horse\n5.donkey\n6.camel\n"
        + "Insert number of animal's type from the list from above\n");
        String className = scanner.nextLine();
        return className;
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
}
