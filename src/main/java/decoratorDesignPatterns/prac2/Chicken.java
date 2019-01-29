package decoratorDesignPatterns.prac2;

public class Chicken extends PastaDecorator {

    public Chicken(Pasta pasta) {
        super(pasta);
    }

    @Override
    public String getDescription() {
        return pasta.getDescription() + ", Chicken";
    }

    @Override
    public double getCost() {
        return pasta.getCost() + 1.00;
    }
}
