package lld.designPatterns.behavioralDesignPattern.observerDesignPrinciple.vishwaBatch;

public interface VishwaSession {
    public void register(ObserverStudent observerStudent);
    public void deRegister(ObserverStudent observerStudent);
    public void notifyObservingStudents();
    public String getUpdate(ObserverStudent observerStudent);
}
