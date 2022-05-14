package lld.designPrinciples.polymorphism.dynamicPolymorphism;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        a1.eat();
        a2.eat();
        a3.eat();
    }
}
