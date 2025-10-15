package good;
public class Espresso implements Coffee {

    @Override
    public void boil() {
        System.out.println("Boiling water for Espresso");
    }

    @Override
    public void freeze() {
        System.out.println("Freezing water for Espresso");
    }

    @Override
    public void brew() {
        System.out.println("Brewing Espresso");
    }

}
