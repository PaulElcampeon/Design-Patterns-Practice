package decoratorDesignPatterns.prac3;

public class GreenButton extends JacketDecorator {

    public GreenButton(Jacket inJacket) {
        super(inJacket);
    }

    @Override
    public String getDescription() {
        return jacket.getDescription() + ", Green Button";
    }

    @Override
    public double getCost() {
        return jacket.getCost() + 1.30;
    }
}
