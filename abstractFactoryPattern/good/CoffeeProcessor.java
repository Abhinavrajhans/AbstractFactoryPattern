package abstractFactoryPattern.good;

public class CoffeeProcessor {

    private final CoffeeFactory coffeeFactory;
    
    public CoffeeProcessor() {
        this.coffeeFactory = new CoffeeFactory();
    }


    public Coffee prepareCoffee(String coffeeType, String variant) {
        Coffee coffee = coffeeFactory.createCoffee(coffeeType, variant);
        return coffee;
    }
}
