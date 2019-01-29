package decoratorDesignPatterns.prac1;

public class Haribo extends CakeDecorator {

    public Haribo(Cake inCake){
        super(inCake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Haribo";
    }

    @Override
    public double getCost() {
        return cake.getCost() + 1.35;
    }
}
