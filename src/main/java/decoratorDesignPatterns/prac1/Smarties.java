package decoratorDesignPatterns.prac1;

public class Smarties extends CakeDecorator {

    public Smarties(Cake inCake) {
        super(inCake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Smarties";
    }

    @Override
    public double getCost() {
        return cake.getCost() + 0.50;
    }
}
