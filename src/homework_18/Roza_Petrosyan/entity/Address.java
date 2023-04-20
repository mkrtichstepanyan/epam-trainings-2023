package homework_18.Roza_Petrosyan.entity;

public final class Address {
    private final String country;
    private final String city;
    private final String street;
    private final int homeNumber;

    public Address(String country, String city, String street, int homeNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Address obj = (Address) o;
        return (this.country != null && this.country.equals(obj.country)) && (this.city != null && this.city.equals(obj.city))
                && (this.street != null && this.street.equals(obj.street)) && this.homeNumber == obj.homeNumber;

    }

    @Override
    public int hashCode() {
        Object[] fields = {this.country, this.city, this.street, this.homeNumber};
        int hash = 1;
        for (Object field : fields) {
            if (field instanceof Integer) {
                hash = 31 * hash + (int) field;
            } else {
                hash = 31 * hash + (field == null ? 0 : field.hashCode());
            }
        }
        if (hash < 0) {
            hash *= -1;
        }
        return hash;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber=" + homeNumber +
                '}';
    }
}
