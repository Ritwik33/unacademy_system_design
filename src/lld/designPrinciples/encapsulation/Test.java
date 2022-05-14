package lld.designPrinciples.encapsulation;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ritwik");
        person.setAge(21);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
