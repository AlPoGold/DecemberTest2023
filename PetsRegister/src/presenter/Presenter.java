package presenter;
import model.AnimalList;
import model.Command;
import model.NameClasses;
import model.Service.FileHandler;
import view.View;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Presenter {

    private View view;
    private AnimalList registerList;


    public Presenter(View view) {
            this.view = view;
            registerList = new AnimalList();

        }

    public void addAnimal(String name, LocalDate birthDate, NameClasses className, List<Command> knownCommands) {
        registerList.addAnimal(name, birthDate, className, knownCommands);
    }

    public String showDescription() {
        return registerList.getAnimalList();
    }

    public void saveRegister(){
        FileHandler fh = new FileHandler();
        fh.saveFile(getList());
    }

    private Serializable getList() {
        return registerList;
    }

    public void readFile() {

        //Get list animals from file
        FileHandler fh = new FileHandler();
        Serializable object = fh.readFile("PetsRegister/pets_register.out");
        this.registerList = (AnimalList) object;

    }

    public String countAnimals() {
        return String.valueOf(registerList.getCount());
    }

    public boolean deleteById(int idForDelete) {
        boolean success = registerList.deleteById(idForDelete);
        return success;
    }

    public boolean addNewCommand(int id, int numCommand) {
        boolean success = registerList.addNewCommand(id, numCommand);
        return success;
    }
}
