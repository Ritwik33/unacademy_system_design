package lld.designPrinciples.SOLID.liskovsAndInterfaceSegragationPrinciple;

public class PetCat implements LivingCat {

    @Override
    public void drinkMilk() {
        System.out.println("cat is drinking milk");
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
}
