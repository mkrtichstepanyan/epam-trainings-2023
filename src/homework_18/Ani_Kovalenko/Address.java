package homework_18.Ani_Kovalenko;

public final class Address {
    private final String street;
    private final Integer homeNumber;

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
        Address addressToCheck = (Address) objectToCheck;
        if (addressToCheck.street == null || this.street == null) {
            return false;
        }
        return this.street.equals(addressToCheck.street) && this.homeNumber.equals(addressToCheck.homeNumber);
    }

    public int hashCode() {
        int result = 0;
        result = 31 * result + (street == null ? 0 : street.hashCode());
        result = 31 * result + (homeNumber == null ? 0 : homeNumber);
        return result;
    }


}
