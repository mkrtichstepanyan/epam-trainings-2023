package homework_18.garik_gharibyan.entity;

public final class Address {
    private final String city;
    private final String street;

    private final int homeCount;

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHomeCount() {
        return homeCount;
    }

    public Address(final String city, final String street, final int homeCount) {
        this.city = city;
        this.street = street;
        this.homeCount = homeCount;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || !this.getClass().equals(obj.getClass())) {
            return false;
        }

        Address newAddress = (Address) obj;

        if (this.street != null && !this.street.equals(newAddress.street)){
            return false;
        }
        if (this.street == null && newAddress.street != null){
            return false;
        }
        if (this.city != null && !this.city.equals(newAddress.city)){
            return false;
        }
        if (this.city == null && newAddress.city != null){
            return false;
        }

        return this.homeCount == newAddress.homeCount;

    }

    @Override
    public int hashCode() {
        int streetHashCode = street != null ? street.hashCode() : 0;
        int cityHashCode = city != null ? city.hashCode() : 0;

        return 31 * (streetHashCode + cityHashCode + homeCount);
    }

}
