package homework_17.Argishti_Mesropyan.DeepCopy;

public class Address implements Cloneable {
    private String name;
    private Address address;

    Address(String name) {
        this.name = name;
    }

    Address(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Address clone() {
        try {
            Address clone = (Address) super.clone();
            if (this.address != null) {
                clone.setAddress(address.clone());
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    @Override
    public String toString() {
        return name;
    }
}
