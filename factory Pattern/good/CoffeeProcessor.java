package good;

public class CoffeeProcessor {


    public Coffee prepareCoffee(String whichcoffee)
    {
        Coffee coffee = new CoffeeFactory().getCoffee(whichcoffee);
        return coffee;
    }
}
