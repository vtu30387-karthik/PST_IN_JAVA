package ClassRoom_Tasks;

final class Address {

    private final String street;
    private final String city;
    private final String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address withZipCode(String newZipCode) {
        return new Address(street, city, newZipCode);
    }
}

public class ClassRoom_Task17_ImmutableAddress {

    public static void main(String[] args) {

        Address a1 = new Address("MG Road", "Chennai", "600001");

        Address a2 = a1.withZipCode("600002");

        System.out.println("Original Zip Code: " + a1.getZipCode());
        System.out.println("New Zip Code: " + a2.getZipCode());
    }
}
