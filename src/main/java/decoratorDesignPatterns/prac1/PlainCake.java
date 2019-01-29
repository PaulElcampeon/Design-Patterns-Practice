package decoratorDesignPatterns.prac1;

public class PlainCake implements Cake {


    public String getDescription() {
        return "Plain Vanilla Cake";
    }

    public double getCost() {
        return 10.00;
    }
}
