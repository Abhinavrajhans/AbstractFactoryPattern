package abstractFactoryPattern.good.coffee;

import abstractFactoryPattern.good.Coffee;
import abstractFactoryPattern.good.IngredientFactory;

public class Cappuccino extends Coffee {  // ✅ Fixed spelling

    public Cappuccino(IngredientFactory factory) {
        super(factory);
    }

    @Override
    public void boil() {
        System.out.println("Boiling milk for Cappuccino");
    }

    @Override
    public void freeze() {
        System.out.println("Freezing milk for Cappuccino");
    }

    @Override
    public void brew() {
        System.out.println("Brewing Cappuccino");
    }
}
