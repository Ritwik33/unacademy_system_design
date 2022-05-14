package lld.designPrinciples.abstraction;

public class Test {
    public static void main(String[] args) {
        PetCat petcat = new PetCat();
        petcat.makeSound();
        petcat.makeSound();

        ToyCat toycat = new ToyCat();
        toycat.makeSound();
//        toycat.drinkMilk();
    }
}
