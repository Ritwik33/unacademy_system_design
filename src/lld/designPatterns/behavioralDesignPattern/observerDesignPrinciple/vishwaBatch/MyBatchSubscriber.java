package lld.designPatterns.behavioralDesignPattern.observerDesignPrinciple.vishwaBatch;

public class MyBatchSubscriber implements ObserverStudent{

    private String name;
    private VishwaSession vishwaSession;

    public MyBatchSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String sessionPlan = vishwaSession.getUpdate(this);
        System.out.println("fetched the session plan of vishwa classes");
    }

    @Override
    public void setVishwaSessions(VishwaSession vishwaSession) {
        this.vishwaSession = vishwaSession;
    }

    @Override
    public String getName() {
        return name;
    }
}
