package menu;

import coffeetype.*;
import exceptions.InvalidCoffeeException;
import internationalization.LanguageManager;

import java.util.Scanner;

public class Menu {

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();

            String choice = scanner.nextLine();

            try {
                handleChoice(choice, scanner);
            } catch (InvalidCoffeeException e) {
                System.out.println(e.getMessage());
            }
        }

        // (no exit here because loop runs forever)
    }

    private void displayMenu() {

        System.out.println("==== " + LanguageManager.get("menu.title") + " ====");
        System.out.println("1. " + LanguageManager.get("coffee.latte"));
        System.out.println("2. " + LanguageManager.get("coffee.americano"));
        System.out.println("3. " + LanguageManager.get("coffee.espresso"));
        System.out.println("4. " + LanguageManager.get("menu.switch"));
        System.out.println("5. " + LanguageManager.get("menu.exit"));
        System.out.print(LanguageManager.get("menu.choice") + " ");
    }

    private void handleChoice(String input, Scanner scanner) throws InvalidCoffeeException {
        Coffee coffee;

        switch (input) {
            case "1":
                coffee = new Latte();
                startCoffee(coffee);
                break;

            case "2":
                coffee = new Americano();
                startCoffee(coffee);
                break;

            case "3":
                coffee = new Espresso();
                startCoffee(coffee);
                break;

            case "4":
                switchLanguage(scanner);
                break;

            case "5":
                System.out.println(LanguageManager.get("menu.exit"));
                System.exit(0);
                break;

            default:
                throw new InvalidCoffeeException(LanguageManager.get("error.invalid"));
        }

    }

    private void startCoffee(Coffee coffee) {
        Thread t = new Thread(new CoffeeMaker(coffee));
        t.start();

    }
    private void switchLanguage(Scanner scanner) {

        System.out.println("Enter language (en/fr): ");
        String lang = scanner.nextLine();

        LanguageManager.switchLanguage(lang);
    }
}