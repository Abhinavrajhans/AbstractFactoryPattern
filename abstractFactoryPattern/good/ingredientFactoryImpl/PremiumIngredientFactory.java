package abstractFactoryPattern.good.ingredientFactoryImpl;
import abstractFactoryPattern.good.IngredientFactory;
import abstractFactoryPattern.good.coffeeType.CoffeeType;
import abstractFactoryPattern.good.coffeeType.impl.Arabica;
import abstractFactoryPattern.good.milk.Milk;
import abstractFactoryPattern.good.milk.impl.CowMilk;
import abstractFactoryPattern.good.sugar.Sugar;
import abstractFactoryPattern.good.sugar.impl.WhiteSugar;


public class PremiumIngredientFactory implements IngredientFactory {
    @Override
    public Milk createMilk() {
        return new CowMilk();
    }

    @Override
    public Sugar createSugar() {
        return new WhiteSugar();
    }

    @Override
    public CoffeeType createCoffeeType() {
        return new Arabica();
    }
}
