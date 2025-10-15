package problemetic;

public class CoffeeProcessor {


    public Coffee prepareCoffee(String whichcoffee)
    {
        Coffee coffee;
        if(whichcoffee.equals("expresso"))
        {
            coffee=new Expresso();
        }
        else if(whichcoffee.equals("cappucino"))
        {
            coffee=new Cappucino();
        }
        else 
        {
            coffee=new Latte();
        }
        return coffee;
    }
}
