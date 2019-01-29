package decoratorDesignPatterns.prac2;

public class Pesto extends PastaDecorator {

    public Pesto(Pasta pasta) {
        super(pasta);
    }

    @Override
    public String getDescription() {
        return pasta.getDescription() + ", Green Pesto";
    }

    @Override
    public double getCost() {
        return pasta.getCost() + 0.50;
    }
}
