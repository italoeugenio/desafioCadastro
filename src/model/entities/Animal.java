package src.model.entities;

import src.enums.AnimalGender;
import src.enums.AnimalType;

import java.util.ArrayList;

public abstract class Animal {
    private String name;
    private AnimalGender animalGender;
    private AnimalType animalType;
    private String adress;
    private int age;
    private float weigth;
    public String breed;

    public Animal(String adress, int age, AnimalGender animalGender, AnimalType animalType, String breed, String name, float weigth) {
        this.adress = adress;
        this.age = age;
        this.animalGender = animalGender;
        this.animalType = animalType;
        this.breed = breed;
        this.name = name;
        this.weigth = weigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public AnimalGender getAnimalGender() {
        return animalGender;
    }

    public void setAnimalGender(AnimalGender animalGender) {
        this.animalGender = animalGender;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }
}
