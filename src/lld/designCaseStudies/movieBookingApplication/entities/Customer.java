package lld.designCaseStudies.movieBookingApplication.entities;

import java.util.List;

public class Customer extends User{

    public Customer(int id, String name, Address address, int age, List<Long> phoneNumber) {
        super(id, name, address, age, phoneNumber);
    }

}
