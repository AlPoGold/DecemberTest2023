package model;

import java.util.HashMap;

public enum NameClasses {
    cat, dog, hamster, horse, donkey, camel;

    public static HashMap<Integer, NameClasses> getNameClasses() {
        NameClasses[] nCl = NameClasses.values();
        HashMap<Integer, NameClasses> mapClass = new HashMap<>();
        for (int i = 0; i < nCl.length; i++) {
            mapClass.put(i+1, nCl[i]);
        }
        return mapClass;
    }
}


