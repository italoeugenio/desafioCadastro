package src.menu;

import src.forms.ReaderForm;
import src.model.entities.Animal;
import src.service.AnimalService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void printMenu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            ReaderForm.readQuestions();
            System.out.println("\n===== MENU =====");
            System.out.println("1. Register a new pet");
            System.out.println("2. Update pet information");
            System.out.println("3. Delete a pet");
            System.out.println("4. View all pets in the system");
            System.out.println("5. Search by name, age or breed");
            System.out.println("6. Exit");
            System.out.print("Enter a option: ");
            int opcao = scanner.nextInt();
            while(opcao < 0 || opcao > 6){
                System.out.print("Enter a valid option: ");
                opcao = scanner.nextInt();
            }

            switch (opcao){
                case 1:
                    AnimalService.registerAnimal();
                    break;
                case 2:
                    System.out.println("1");
                    break;
                case 3:
                    System.out.println("1");
                    break;
                case 4:
                    System.out.println("1");
                    break;
                case 5:
                    System.out.println("1");
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, enter again");
            }
        }


    }

    public static void main(String[] args) {
        Menu.printMenu();
    }
}
