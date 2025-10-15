package abstractFactoryPattern.good;

import abstractFactoryPattern.good.coffee.Cappuccino;
import abstractFactoryPattern.good.coffee.Espresso;
import abstractFactoryPattern.good.coffee.Latte;
import abstractFactoryPattern.good.ingredientFactoryImpl.EconomyIngredientFactory;
import abstractFactoryPattern.good.ingredientFactoryImpl.PremiumIngredientFactory;

public class CoffeeFactory {

    public static Coffee createCoffee(String type, String variant) {
        IngredientFactory factory;

        // Choose ingredient factory based on variant
        if (variant.equalsIgnoreCase("premium")) {
            factory = new PremiumIngredientFactory();
        } else if (variant.equalsIgnoreCase("economy")) {
            factory = new EconomyIngredientFactory();
        } else {
            throw new IllegalArgumentException("Unknown variant: " + variant);
        }

        // Choose coffee type
        switch(type.toLowerCase()) {
            case "espresso":
                return new Espresso(factory);
            case "cappuccino":
                return new Cappuccino(factory);
            case "latte":
                return new Latte(factory);
            default:
                throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
}
