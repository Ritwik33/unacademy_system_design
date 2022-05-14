package lld.designPrinciples.polymorphism.dynamicPolymorphism;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
