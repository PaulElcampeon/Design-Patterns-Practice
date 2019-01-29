package decoratorDesignPatterns.prac2;

public class PastaMaker {


    public static void main(String[] args){
        Pasta myChickenAndBaconPasta = new Bacon(new Chicken(new PlainPasta()));

        System.out.printf("%s%n",myChickenAndBaconPasta.getDescription());

        System.out.printf("%,.2f%n",myChickenAndBaconPasta.getCost());

    }
}
