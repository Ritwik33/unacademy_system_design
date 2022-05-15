package lld.designPatterns.behavioralDesignPattern.chainOfResponsibilityDesignPrinciple.UnacademyJobGuaranteeProgram;

public interface JobChain {
    public void setNextJob(JobChain jobChain);
    public void getJob(Person person);
}
