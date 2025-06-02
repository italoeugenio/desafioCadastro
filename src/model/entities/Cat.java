package src.model.entities;

import src.enums.AnimalGender;
import src.enums.AnimalType;

public class Cat extends Animal{

    public Cat(String adress, int age, AnimalGender animalGender, AnimalType animalType, String breed, String name, float weigth) {
        super(adress, age, animalGender, animalType, breed, name, weigth);
    }
}
