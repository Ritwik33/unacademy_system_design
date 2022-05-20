package lld.designPatterns.behavioralDesignPattern.chainOfResponsibilityDesignPattern.UnacademyJobGuaranteeProgram;

public class UnacademyJobGuaranteeProgram {
    public static void main(String[] args) {

        Faang faang = new Faang();
        ProductBased productBased = new ProductBased();
        ServiceBased serviceBased = new ServiceBased();

        faang.setNextJob(productBased);
        productBased.setNextJob(serviceBased);

        Person person = new Person("PRODUCT");

        faang.getJob(person);
    }
}
