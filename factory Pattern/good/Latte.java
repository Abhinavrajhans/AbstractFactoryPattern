package good;

public class Latte implements Coffee {

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
