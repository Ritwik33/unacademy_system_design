package lld.designPrinciples.SOLID.singleResponsibilityPrinciple;

public class UIPortal {
    public static void main(String[] args) {

        Employee employee = new Employee("Ritwik" , 300400, "May 14, 22");

        EmployeeHiring employeeHiring = new EmployeeHiring();
        employeeHiring.hireEmployee(employee);

        CalculateSalary calculateSalary = new CalculateSalary();
        calculateSalary.salaryCalculator(employee);

        EmployeeEvaluator employeeEvaluator = new EmployeeEvaluator();
        employeeEvaluator.evaluateEmployee(employee);

    }
}
