package lld.designPrinciples.abstraction;

public class ToyCat implements Cat{
    @Override
    public void drinkMilk() {
        throw new RuntimeException("I dont drink Milk");
    }

    @Override
    public void makeSound() {
        System.out.println("Robotic meow meow");
    }
}
