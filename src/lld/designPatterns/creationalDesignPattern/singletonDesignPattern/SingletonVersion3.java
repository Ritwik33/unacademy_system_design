package lld.designPatterns.creationalDesignPattern.singletonDesignPattern;

/**
 * singleton version 3 -> thread safe lazy singleton
 * this version is thread safe
 */

public class SingletonVersion3 {
    private SingletonVersion3() {

    }
    private static SingletonVersion3 instance;

    public static synchronized SingletonVersion3 getInstance() {
        if(instance == null) {
            instance = new SingletonVersion3();
        }
        return instance;
    }
}
