package lld.designPrinciples.polymorphism.staticPolymorphism;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4, 5, 10));
        System.out.println((calculator.add(4, 14)));
        System.out.println((calculator.add()));
    }
}
