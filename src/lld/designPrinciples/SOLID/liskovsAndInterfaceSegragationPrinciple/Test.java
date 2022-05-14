package lld.designPrinciples.SOLID.liskovsAndInterfaceSegragationPrinciple;

public class Test {
    public static void main(String[] args) {

        ToyCat toyCat = new ToyCat();
        toyCat.makeSound();

        PetCat petCat = new PetCat();
        petCat.drinkMilk();
        petCat.makeSound();

    }
}
