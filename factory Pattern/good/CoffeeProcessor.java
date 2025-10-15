package good;

public class CoffeeProcessor {
    private final CoffeeFactory coffeeFactory;
    
    public CoffeeProcessor() {
        this.coffeeFactory = new CoffeeFactory();
    }
    
    public Coffee prepareCoffee(String coffeeType) {
        return coffeeFactory.getCoffee(coffeeType);
    }
}