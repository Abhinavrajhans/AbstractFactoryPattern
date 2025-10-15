package good;

public class Cappuccino implements Coffee {

    @Override
    public void boil() {
        System.out.println("Boiling milk for Cappuccino");
    }

    @Override
    public void freeze() {
        System.out.println("Freezing milk for Cappuccino");
    }

    @Override
    public void brew() {
        System.out.println("Brewing Cappuccino");
    }

}