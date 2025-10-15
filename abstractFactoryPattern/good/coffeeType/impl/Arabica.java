package abstractFactoryPattern.good.coffeeType.impl;

import abstractFactoryPattern.good.coffeeType.CoffeeType;

public class Arabica implements CoffeeType {
    @Override
    public String getCoffeeTypeName() {
        return "Arabica";
    }
}