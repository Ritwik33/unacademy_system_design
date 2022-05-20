package lld.designPatterns.behavioralDesignPattern.chainOfResponsibilityDesignPattern.UnacademyJobGuaranteeProgram;

public class Faang implements JobChain{

    private JobChain jobChain;

    @Override
    public void setNextJob(JobChain jobChain) {
        this.jobChain = jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillSet().equals("FAANG")) {
            System.out.println("Selected in FAANG");
        } else {
            System.out.println("rejected in faang");
            System.out.println("preparing for product based companies");
            jobChain.getJob(person);
        }
    }
}
