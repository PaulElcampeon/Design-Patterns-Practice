package decoratorDesignPatterns.prac3;

public class JacketMaker {

    public static void main(String[] args){

        Jacket newJacket = new GreenButton(new RedButton(new PlainJacket()));

        System.out.printf("%n%s", newJacket.getDescription());

        System.out.printf("%n%,.2f", newJacket.getCost());


    }
}
