package lld.designPrinciples.polymorphism.staticPolymorphism;

public class Calculator {
    public int add(int a, int b, int c) {
        return a+b+c;
    }
    public int add(int a, int b) {
        return a+b;
    }
    public int add() {
        throw new RuntimeException("No data");
    }
}
