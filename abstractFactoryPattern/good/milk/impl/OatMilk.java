package abstractFactoryPattern.good.milk.impl;
import abstractFactoryPattern.good.milk.Milk;


public class OatMilk implements Milk {
    @Override
    public String getMilkName() {
        return "Oat Milk";
    }
}
