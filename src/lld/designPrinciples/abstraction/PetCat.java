package lld.designPrinciples.abstraction;

public class PetCat implements Cat{

    @Override
    public void drinkMilk() {
        System.out.println("Drinking milk");
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
}
