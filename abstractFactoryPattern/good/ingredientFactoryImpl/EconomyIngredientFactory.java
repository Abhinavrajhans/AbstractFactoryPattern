
package abstractFactoryPattern.good.ingredientFactoryImpl;
import abstractFactoryPattern.good.coffeeType.CoffeeType;
import abstractFactoryPattern.good.coffeeType.impl.Robusta;
import abstractFactoryPattern.good.milk.Milk;
import abstractFactoryPattern.good.milk.impl.CowMilk;
import abstractFactoryPattern.good.sugar.Sugar;
import abstractFactoryPattern.good.sugar.impl.BrownSugar;
import abstractFactoryPattern.good.IngredientFactory;


public class EconomyIngredientFactory implements IngredientFactory {
    @Override
    public Milk createMilk() {
        return new CowMilk();
    }

    @Override
    public Sugar createSugar() {
        return new BrownSugar();
    }

    @Override
    public CoffeeType createCoffeeType() {
        return new Robusta();
    }
}