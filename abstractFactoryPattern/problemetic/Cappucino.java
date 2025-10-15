package good;

public class Cappucino implements Coffee {

    @Override
    public void boil() {
        System.out.println("Boiling milk for cappucino");
    }

    @Override
    public void freeze() {
        System.out.println("Freezing milk for cappucino");
    }

    @Override
    public void brew() {
        System.out.println("Brewing cappucino");
    }

}