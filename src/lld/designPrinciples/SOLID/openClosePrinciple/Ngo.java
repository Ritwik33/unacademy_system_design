package lld.designPrinciples.SOLID.openClosePrinciple;

public class Ngo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        AnimalFeeder animalFeeder = new AnimalFeeder();
        animalFeeder.feedAnimal(dog);

        Animal cat = new Cat();
        animalFeeder.feedAnimal(cat);

        Animal elephant = new Elephant();
        animalFeeder.feedAnimal(elephant);
    }
}
