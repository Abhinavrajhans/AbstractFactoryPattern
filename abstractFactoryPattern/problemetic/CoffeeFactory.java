package good;

public class CoffeeFactory {
    public Coffee getCoffee(String whichcoffee,String whichMilk,String whichSugar , String whichCoffeeType) {
      Coffee coffee;
        if(whichcoffee.equals("expresso") && whichMilk.equals("OatMilt") && whichSugar.equals("brown")
        && whichCoffeeType.equals("robusta"))coffee=new Expresso();
        else if(whichcoffee.equals("cappucino")) coffee=new Cappucino();
        else coffee=new Latte();
        return coffee;
    }
}