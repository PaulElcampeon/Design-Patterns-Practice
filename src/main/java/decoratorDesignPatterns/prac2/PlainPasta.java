package decoratorDesignPatterns.prac2;

public class PlainPasta implements Pasta {

    public String getDescription() {
        return "Ingredients: Plain pasta";
    }

    public double getCost() {
        return 3.50;
    }
}
