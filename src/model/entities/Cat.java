package src.model.entities;

import src.enums.AnimalGender;
import src.enums.AnimalType;

public class Cat extends Animal{
    public Cat(String adress, AnimalGender animalGender, AnimalType animalType, String breed,float weigth,String name) {
        super(adress, animalGender, animalType, breed, name, weigth);
    }
}
