package lld.designPatterns.behavioralDesignPattern.observerDesignPattern.vishwaBatch;

public class Test {
    public static void main(String[] args) {

        VishwaBatch vishwaBatch = new VishwaBatch();

        ObserverStudent observerStudent1 = new MyBatchSubscriber("Mohan");
        ObserverStudent observerStudent2 = new MyBatchSubscriber("Rahul");
        ObserverStudent observerStudent3 = new MyBatchSubscriber("Shivani");
        ObserverStudent observerStudent4 = new MyBatchSubscriber("Akanksha");

        vishwaBatch.register(observerStudent1);
        vishwaBatch.register(observerStudent2);
        vishwaBatch.register(observerStudent3);
        vishwaBatch.register(observerStudent4);

        observerStudent1.setVishwaSessions(vishwaBatch);
        observerStudent2.setVishwaSessions(vishwaBatch);
        observerStudent3.setVishwaSessions(vishwaBatch);
        observerStudent4.setVishwaSessions(vishwaBatch);

        vishwaBatch.addStudyTopic("Observer pattern");
    }
}
