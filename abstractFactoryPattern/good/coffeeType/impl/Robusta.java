package abstractFactoryPattern.good.coffeeType.impl;

import abstractFactoryPattern.good.coffeeType.CoffeeType;

public class Robusta implements CoffeeType {
    @Override
    public String getCoffeeTypeName() {
        return "Robusta";
    }
}
