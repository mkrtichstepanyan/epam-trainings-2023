package homework_18.yeghia_ansuryan;

public class Address {
    String street;
    int homeNumber;

    Address(String street, int homeNumber) {
        this.street = street;
        this.homeNumber = homeNumber;
    }

    public boolean equals(Object objectToCheck) {
        if (this == objectToCheck) {
            return true;
        }
        if (!(objectToCheck instanceof Address)) {
            return false;
        }
        Address address = (Address) objectToCheck;
        return this.street.equals(address.street) && this.homeNumber == address.homeNumber;
    }

    public int hashCode() {
        int result = 0;
        result = 31 * result + (street == null ? 0 : street.hashCode());
        result = 31 * result + homeNumber;
        return result;
    }
}
