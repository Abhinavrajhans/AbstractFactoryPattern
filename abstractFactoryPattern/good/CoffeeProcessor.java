package abstractFactoryPattern.good;

public class CoffeeProcessor {


    public Coffee prepareCoffee(String coffeeType, String variant) {
        Coffee coffee = CoffeeFactory.createCoffee(coffeeType, variant);
        return coffee;
    }
}
