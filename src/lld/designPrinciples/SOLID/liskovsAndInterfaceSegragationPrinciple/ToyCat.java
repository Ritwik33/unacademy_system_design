package lld.designPrinciples.SOLID.liskovsAndInterfaceSegragationPrinciple;

public class ToyCat implements MechanicalCat {

    @Override
    public void makeSound() {
        System.out.println("robotic meow meow");
    }

}
