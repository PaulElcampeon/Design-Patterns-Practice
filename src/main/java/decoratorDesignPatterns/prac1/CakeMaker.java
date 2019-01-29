package decoratorDesignPatterns.prac1;

public class CakeMaker {

    public static void main(String[] args){

        Cake assortedCake = new Haribo(new Smarties(new Smarties(new PlainCake())));

        System.out.println(assortedCake.getDescription());

        System.out.printf("Cake cost is %,.2f %n",assortedCake.getCost());

    }
}
