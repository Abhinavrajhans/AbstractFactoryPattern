package abstractFactoryPattern.good.coffee;

import abstractFactoryPattern.good.Coffee;
import abstractFactoryPattern.good.IngredientFactory;


public class Latte extends Coffee {

    public Latte(IngredientFactory factory) {
        super(factory);
    }

    @Override
    public void boil() {
        System.out.println("Boiling milk for latte");
    }

    @Override
    public void freeze() {
        System.out.println("Freezing milk for latte");
    }

    @Override
    public void brew() {
        System.out.println("Brewing latte");
    }
    
}
