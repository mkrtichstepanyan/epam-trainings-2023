package homework_18.garik_gharibyan.entity;

public class Address {
    private final String city;
    private final String street;

    private final int homeCount;

    public Address(String city, String street, int homeCount) {
        this.city = city;
        this.street = street;
        this.homeCount = homeCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !this.getClass().equals(obj.getClass())) {
            return false;
        }
        Address newAddress = (Address) obj;
        if (this == obj) {
            return true;
        }

        return this.street.equals(newAddress.street) &&
                this.city.equals(newAddress.city) &&
                this.homeCount == newAddress.homeCount;

    }

    @Override
    public int hashCode() {
        return 31 * (street.hashCode() + city.hashCode() + homeCount);
    }
}
