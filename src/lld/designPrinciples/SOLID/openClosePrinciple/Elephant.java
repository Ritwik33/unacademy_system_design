package lld.designPrinciples.SOLID.openClosePrinciple;

public class Elephant implements Animal{
    @Override
    public void feed() {
        System.out.println("Elephant is being fed");
    }
}
