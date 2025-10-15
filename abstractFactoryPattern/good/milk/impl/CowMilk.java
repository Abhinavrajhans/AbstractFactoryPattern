package abstractFactoryPattern.good.milk.impl;
import abstractFactoryPattern.good.milk.Milk; 


public class CowMilk implements Milk {
    @Override
    public String getMilkName() {
        return "Whole Milk";
    }
}
