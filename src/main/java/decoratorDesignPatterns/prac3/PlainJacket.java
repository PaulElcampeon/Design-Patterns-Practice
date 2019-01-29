package decoratorDesignPatterns.prac3;

public class PlainJacket implements Jacket {

    public String getDescription() {
        return "Plain Jacket with";
    }

    public double getCost() {
        return 50.00;
    }
}
