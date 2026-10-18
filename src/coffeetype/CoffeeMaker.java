package coffeetype;

import internationalization.LanguageManager;

public class CoffeeMaker implements Runnable {

    private Coffee coffee;

    public CoffeeMaker(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void run() {
        // Play sound
        coffee.playSound();

        // Preparing message
        System.out.println(
                LanguageManager.get("coffee.preparing") + " " + coffee.getName() + "..."
        );

        try {
            Thread.sleep(coffee.getBrewingTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Ready message
        System.out.println(
                coffee.getName() + " " + LanguageManager.get("coffee.ready")
        );
    }
}