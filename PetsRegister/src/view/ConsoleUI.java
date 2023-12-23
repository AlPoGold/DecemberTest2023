package view;

import presenter.Presenter;

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


}
