package lld.designPatterns.creationalDesignPattern.singletonDesignPattern;

/**
 * singleton version 1 -> Eager singleton
 */

public class SingletonVersion1 {
    private SingletonVersion1() {

    }
    private static final SingletonVersion1 INSTANCE = new SingletonVersion1();
    public static SingletonVersion1 getInstance() {
        return INSTANCE;
    }
}
