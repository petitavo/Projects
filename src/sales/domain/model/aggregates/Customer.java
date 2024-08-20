package sales.domain.model.aggregates;

import shared.Address;

import java.util.UUID;

public class Customer {
    private final UUID customerId;
    private final string firstName;
    private final string LastName;
    private final Address address;


    public Customer(string firstName, string lastName) {
        this.customerId = UUID.randomUUID();
        this.firstName = firstName;
        LastName = lastName;
        this.address = new Address();
    }
    public void setAddress(String street, String city, String state, String zip, String country) {
        this.address.setFullAddress(street, city, state, zip, country);
    }
}
