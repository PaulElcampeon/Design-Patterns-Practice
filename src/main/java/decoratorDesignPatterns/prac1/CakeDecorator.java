package decoratorDesignPatterns.prac1;

public abstract class CakeDecorator implements Cake {

    public Cake cake;

    public CakeDecorator(Cake baseCake){
        this.cake = baseCake;
    }

    public String getDescription() {
        return cake.getDescription();
    }

    public double getCost() {
        return cake.getCost();
    }
}
