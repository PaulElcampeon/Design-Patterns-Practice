package decoratorDesignPatterns.prac3;

public abstract class JacketDecorator implements Jacket {

    public Jacket jacket;

    public JacketDecorator(Jacket inJacket){
        jacket = inJacket;
    }

    public String getDescription() {
        return jacket.getDescription();
    }

    public double getCost() {
        return jacket.getCost();
    }
}
