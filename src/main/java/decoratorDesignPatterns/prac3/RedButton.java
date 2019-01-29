package decoratorDesignPatterns.prac3;

public class RedButton extends JacketDecorator {

    public RedButton(Jacket inJacket) {
        super(inJacket);
    }

    @Override
    public String getDescription() {
        return jacket.getDescription() + ", Red Button";
    }

    @Override
    public double getCost() {
        return jacket.getCost() + 1.20;
    }
}
