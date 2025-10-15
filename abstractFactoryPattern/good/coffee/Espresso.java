package abstractFactoryPattern.good.coffee;

import abstractFactoryPattern.good.Coffee;
import abstractFactoryPattern.good.IngredientFactory;

public class Espresso extends Coffee {  // ✅ Espresso

    public Espresso(IngredientFactory factory) {  // ✅ matches class name
        super(factory);
    }

    @Override
    public void boil() {
        System.out.println("Boiling water for espresso");
    }

    @Override
    public void freeze() {
        System.out.println("Freezing water for espresso");
    }

    @Override
    public void brew() {
        System.out.println("Brewing espresso");
    }
}