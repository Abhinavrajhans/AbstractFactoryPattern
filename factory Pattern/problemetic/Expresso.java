package problemetic;

public class Expresso implements Coffee {

    @Override
    public void boil() {
        System.out.println("Boiling water for expresso");
    }

    @Override
    public void freeze() {
        System.out.println("Freezing water for expresso");
    }

    @Override
    public void brew() {
        System.out.println("Brewing expresso");
    }

}
