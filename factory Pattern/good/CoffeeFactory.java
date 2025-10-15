package good;

public class CoffeeFactory {
    public Coffee getCoffee(String coffeeType) {
        if (coffeeType == null || coffeeType.isEmpty()) {
            throw new IllegalArgumentException("Coffee type cannot be null or empty");
        }
        
        switch (coffeeType.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "cappuccino":
                return new Cappuccino();
            case "latte":
                return new Latte();
            default:
                throw new IllegalArgumentException("Unknown coffee type: " + coffeeType);
        }
    }
}