package decoratorDesignPatterns.prac2;

public class Bacon extends PastaDecorator {

    public Bacon(Pasta pasta) {
        super(pasta);
    }

    @Override
    public String getDescription() {
        return pasta.getDescription() + ", bacon";
    }

    @Override
    public double getCost() {
        return pasta.getCost() + 2.30;
    }
}
