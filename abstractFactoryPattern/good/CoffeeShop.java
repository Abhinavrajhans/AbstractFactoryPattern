package abstractFactoryPattern.good;

import abstractFactoryPattern.good.CoffeeProcessor;
import abstractFactoryPattern.good.Coffee;

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeProcessor processor = new CoffeeProcessor();
        
        // Create premium cappuccino
        System.out.println("=== Premium Cappuccino ===");
        Coffee premiumCappuccino = processor.prepareCoffee("cappuccino", "premium");
        premiumCappuccino.brew();
        premiumCappuccino.boil();
        premiumCappuccino.serve();
        
        System.out.println();
        
        // Create economy latte
        System.out.println("=== Economy Latte ===");
        Coffee economyLatte = processor.prepareCoffee("latte", "economy");
        economyLatte.brew();
        economyLatte.boil();
        economyLatte.serve();
        
        System.out.println();
        
        // Create premium espresso
        System.out.println("=== Premium Espresso ===");
        Coffee premiumEspresso = processor.prepareCoffee("espresso", "premium");
        premiumEspresso.brew();
        premiumEspresso.boil();
        premiumEspresso.serve();
    }
}