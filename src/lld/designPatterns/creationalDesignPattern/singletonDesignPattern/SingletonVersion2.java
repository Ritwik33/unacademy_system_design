package lld.designPatterns.creationalDesignPattern.singletonDesignPattern;

/**
 * singleton version 2 -> lazy singleton
 * this version is not thread safe
 * if there are multiple threads, this version creates multiple objects
 */

public class SingletonVersion2 {

    private SingletonVersion2() {
    }

    private static SingletonVersion2 instance;

    public static SingletonVersion2 getInstance() {
        if(instance == null) {
            instance = new SingletonVersion2();
        }
        return instance;
    }
}
