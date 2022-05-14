package lld.designPrinciples.SOLID.openClosePrinciple;

public class Cat implements Animal{
    @Override
    public void feed() {
        System.out.println("Cat is being fed");
    }
}
