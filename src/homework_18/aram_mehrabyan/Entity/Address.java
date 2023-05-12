package homework_18.aram_mehrabyan.Entity;

public final class Address {
   private final   String country;
   private final String city;
  private final    String street;
  private final int homeNumber;

    public Address( final String country,final String city,final String street,final int homeNumber) {
        this.country = country;
        this.city=city;
        this.street = street;
        this.homeNumber = homeNumber;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !this.getClass().equals(obj.getClass())) {
            return false;
        }
        Address otherAddress = (Address) obj;
        if (this == obj) {
            return true;
        }

        return this.street.equals(otherAddress.street) &&
                this.city.equals(otherAddress.city) &&
                this.homeNumber == otherAddress.homeNumber;

    }
    @Override
    public int hashCode() {
        return 31 * (street.hashCode() + city.hashCode() + homeNumber);
    }
}
