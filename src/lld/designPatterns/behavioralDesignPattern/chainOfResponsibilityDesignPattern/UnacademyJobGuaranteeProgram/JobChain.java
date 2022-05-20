package lld.designPatterns.behavioralDesignPattern.chainOfResponsibilityDesignPattern.UnacademyJobGuaranteeProgram;

public interface JobChain {
    public void setNextJob(JobChain jobChain);
    public void getJob(Person person);
}
