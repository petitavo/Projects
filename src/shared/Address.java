package shared;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    public Address() {
        this.country = "";
        this.zip = "";
        this.state = "";
        this.city = "";
        this.street = "";
    }

    public Address(String country, String zip, String state, String city, String street) {
        this.country = country;
        this.zip = zip;
        this.state = state;
        this.city = city;
        this.street = street;
    }

    public String getFullAddress() {
        return street + ", " + city + ", " + state + ", ZIP" + zip + ", " + country;
    }
    public void setFullAddress(String street, String city, String state, String zip, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
}
