package good;

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeProcessor processor = new CoffeeProcessor();
        
        System.out.println("=== Welcome to Coffee Shop ===\n");
        
        // Order 1: Espresso
        System.out.println("--- Order 1: Espresso ---");
        try {
            Coffee espresso = processor.prepareCoffee("espresso");
            espresso.boil();
            espresso.brew();
            espresso.freeze();
            System.out.println("Espresso is ready!\n");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + "\n");
        }
        
        // Order 2: Cappuccino
        System.out.println("--- Order 2: Cappuccino ---");
        try {
            Coffee cappuccino = processor.prepareCoffee("Cappuccino");
            cappuccino.boil();
            cappuccino.brew();
            cappuccino.freeze();
            System.out.println("Cappuccino is ready!\n");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + "\n");
        }
        
        // Order 3: Latte
        System.out.println("--- Order 3: Latte ---");
        try {
            Coffee latte = processor.prepareCoffee("LATTE");
            latte.boil();
            latte.brew();
            latte.freeze();
            System.out.println("Latte is ready!\n");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + "\n");
        }
        
        // Order 4: Invalid coffee type
        System.out.println("--- Order 4: Mocha (Invalid) ---");
        try {
            Coffee mocha = processor.prepareCoffee("mocha");
            mocha.boil();
            mocha.brew();
            mocha.freeze();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + "\n");
        }
        
        // Order 5: Null coffee type
        System.out.println("--- Order 5: Null Input ---");
        try {
            Coffee nullCoffee = processor.prepareCoffee(null);
            nullCoffee.boil();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + "\n");
        }
        
        // Order 6: Empty string
        System.out.println("--- Order 6: Empty String ---");
        try {
            Coffee emptyCoffee = processor.prepareCoffee("");
            emptyCoffee.boil();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + "\n");
        }
        
        System.out.println("=== Coffee Shop Closed ===");
    }

}
