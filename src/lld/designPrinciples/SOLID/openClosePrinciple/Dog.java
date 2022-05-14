package lld.designPrinciples.SOLID.openClosePrinciple;

public class Dog implements Animal{
    @Override
    public void feed() {
        System.out.println("Dog is being fed");
    }
}
