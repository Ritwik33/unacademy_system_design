package lld.designPatterns.behavioralDesignPattern.chainOfResponsibilityDesignPattern.UnacademyJobGuaranteeProgram;

public class ProductBased implements JobChain {

    private JobChain jobChain;

    @Override
    public void setNextJob(JobChain jobChain) {
        this.jobChain = jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillSet().equals("PRODUCT")) {
            System.out.println("Selected in product based company");
        } else {
            System.out.println("rejected in product based company");
            System.out.println("preparing for service based company");
            jobChain.getJob(person);
        }
    }
}
