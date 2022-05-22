package lld.designCaseStudies.movieBookingApplication.entities;

import java.util.List;

public class Admin extends User {

    private long employeeId;

    public Admin(int id, String name, Address address, int age, List<Long> phoneNumber) {
        super(id, name, address, age, phoneNumber);
    }

    public Admin(int id, String name, Address address, int age, List<Long> phoneNumber, long employeeId) {
        super(id, name, address, age, phoneNumber);
        this.employeeId = employeeId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
}
