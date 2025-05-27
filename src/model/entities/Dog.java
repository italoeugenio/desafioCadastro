package src.model.entities;

import src.enums.AnimalGender;
import src.enums.AnimalType;

public class Dog extends Animal{
    public Dog(String adress, AnimalGender animalGender, AnimalType animalType, String breed, String name, float weigth) {
        super(adress, animalGender, animalType, breed, name, weigth);
    }
}
