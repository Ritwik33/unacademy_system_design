package lld.designPrinciples.SOLID.singleResponsibilityPrinciple;

public class Employee {

    private String name;
    private int id;
    private String doj;

    public Employee(String name, int id, String doj) {
        this.name = name;
        this.id = id;
        this.doj = doj;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDoj() {
        return doj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", doj='" + doj + '\'' +
                '}';
    }
}
