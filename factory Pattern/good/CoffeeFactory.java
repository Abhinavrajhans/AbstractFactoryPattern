package good;

public class CoffeeFactory {
    public Coffee getCoffee(String whichcoffee) {
      Coffee coffee;
        if(whichcoffee.equals("expresso"))coffee=new Expresso();
        else if(whichcoffee.equals("cappucino")) coffee=new Cappucino();
        else coffee=new Latte();
        return coffee;
    }
}