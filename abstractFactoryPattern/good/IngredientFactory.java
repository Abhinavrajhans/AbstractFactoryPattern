package abstractFactoryPattern.good;
import abstractFactoryPattern.good.coffeeType.CoffeeType;
import abstractFactoryPattern.good.milk.Milk;
import abstractFactoryPattern.good.sugar.Sugar;

public interface IngredientFactory {
    Milk createMilk();
    Sugar createSugar();
    CoffeeType createCoffeeType();
}

