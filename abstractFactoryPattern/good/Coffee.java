package abstractFactoryPattern.good;

import abstractFactoryPattern.good.coffeeType.CoffeeType;
import abstractFactoryPattern.good.milk.Milk;
import abstractFactoryPattern.good.sugar.Sugar;

public abstract class Coffee {
    protected Milk milk;
    protected Sugar sugar;
    protected CoffeeType coffeeType;
    protected IngredientFactory ingredientFactory;

    public Coffee(IngredientFactory factory) {
        this.ingredientFactory = factory;
        this.milk = factory.createMilk();
        this.sugar = factory.createSugar();
        this.coffeeType = factory.createCoffeeType();
    }

    // ✅ make these public
    public abstract void brew();
    public abstract void boil();
    public abstract void freeze();

    public void serve() {
        System.out.println("Serving coffee with " + milk.getMilkName() + 
                         ", " + sugar.getSugarName() + 
                         ", and " + coffeeType.getCoffeeTypeName());
    }
}