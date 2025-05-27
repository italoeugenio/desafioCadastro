package src.service;

import src.enums.AnimalGender;
import src.enums.AnimalType;
import src.model.entities.Animal;
import src.model.entities.Cat;
import src.model.entities.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalService {
    private final List<Animal> animalList = new ArrayList<>();

    public static Animal registerAnimal() {
        Scanner scanner = new Scanner(System.in);
        String name = enterAnimalName();
        AnimalType type = chooseAnimalType();
        AnimalGender gender = chooseAnimalGender();
        String adress = enterAdress();
        int age = enterAge();
        float weigth = enterWeight();
        String breed = enterBreed();

        if(type == AnimalType.DOG){
            return new Dog(adress,gender,type,breed,name,weigth);
        } else {
            return new Cat(adress,gender,type,breed,weigth,name);
        }

    }

    public static String enterAnimalName() {
        System.out.print("Enter the first and last name from animal: ");
        return new Scanner(System.in).nextLine();
    }

    public static AnimalType chooseAnimalType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select type");
        System.out.println("1. DOG");
        System.out.println("2. CAT");
        System.out.print("Enter a option: ");

        int type = scanner.nextInt();
        while (type < 0 || type > 2) {
            System.out.print("Enter a available option: ");
            type = scanner.nextInt();
        }
        return switch (type) {
            case 1 -> AnimalType.DOG;
            case 2 -> AnimalType.CAT;
            default -> null;
        };

    }

    public static AnimalGender chooseAnimalGender() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select gender gender");
        System.out.println("1. MALE");
        System.out.println("2. FEMALE");
        System.out.print("Enter a option: ");

        int type = scanner.nextInt();
        while (type < 0 || type > 2) {
            System.out.print("Enter a available option: ");
            type = scanner.nextInt();
        }
        return switch (type) {
            case 1 -> AnimalGender.MALE;
            case 2 -> AnimalGender.FEMALE;
            default -> null;
        };

    }

    public static String enterAdress() {
        System.out.print("Enter the adress: ");
        return new Scanner(System.in).nextLine();
    }

    public static int enterAge() {
        System.out.print("Enter the Age: ");
        return new Scanner(System.in).nextInt();
    }

    public static float enterWeight() {
        System.out.print("Enter the weight: ");
        return new Scanner(System.in).nextFloat();
    }

    public static String enterBreed() {
        System.out.print("Enter the breed: ");
        return new Scanner(System.in).nextLine();
    }


    public static void main(String[] args) {

    }
}
