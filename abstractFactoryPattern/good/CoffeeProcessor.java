package abstractFactoryPattern.good;

public class CoffeeProcessor {

    // ✅ Fixed: Now calls createCoffee with both parameters
    public Coffee prepareCoffee(String coffeeType, String variant) {
        Coffee coffee = CoffeeFactory.createCoffee(coffeeType, variant);
        return coffee;
    }
}
