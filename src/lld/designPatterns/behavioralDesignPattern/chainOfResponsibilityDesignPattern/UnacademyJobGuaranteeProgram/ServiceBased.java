package lld.designPatterns.behavioralDesignPattern.chainOfResponsibilityDesignPattern.UnacademyJobGuaranteeProgram;

public class ServiceBased implements JobChain {

    private JobChain jobChain;

    @Override
    public void setNextJob(JobChain jobChain) {
        this.jobChain = null;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillSet().equals("SERVICE")) {
            System.out.println("selected in service based company");
        } else {
            System.out.println("rejected in service based company");
            System.out.println("need to prepare more");
        }
    }
}
