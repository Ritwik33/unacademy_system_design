package lld.designPatterns.behavioralDesignPattern.observerDesignPattern.vishwaBatch;

import java.util.ArrayList;
import java.util.List;

public class VishwaBatch implements VishwaSession {

    private List<ObserverStudent> registeredStudents;
    private String studyTopic;

    public VishwaBatch() {
        this.registeredStudents = new ArrayList<>();
    }

    @Override
    public void register(ObserverStudent observerStudent) {
        System.out.println("registering " + observerStudent.getName());
        registeredStudents.add(observerStudent);
    }

    @Override
    public void deRegister(ObserverStudent observerStudent) {
        System.out.println("removing " + observerStudent.getName());
        registeredStudents.remove(observerStudent);
    }

    @Override
    public void notifyObservingStudents() {
        for(ObserverStudent observerStudent : registeredStudents) {
            observerStudent.update();
        }
    }

    @Override
    public String getUpdate(ObserverStudent observerStudent) {
        if(registeredStudents.contains(observerStudent)) {
            return studyTopic;
        }
        return null;
    }

    public void addStudyTopic(String studyTopic) {
        System.out.println("added study topic : " + studyTopic);
        this.studyTopic = studyTopic;
        notifyObservingStudents();
    }
}
