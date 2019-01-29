package decoratorDesignPatterns.prac2;

public abstract class PastaDecorator implements Pasta {

    public Pasta pasta;

    public PastaDecorator(Pasta pasta){
        this.pasta = pasta;
    }

    public String getDescription() {
        return pasta.getDescription();
    }

    public double getCost() {
        return pasta.getCost();
    }
}
