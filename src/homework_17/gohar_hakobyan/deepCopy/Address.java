package homework_17.gohar_hakobyan.deepCopy;

public class Address implements Cloneable {

    private String name;
    private Address next;


    public Address(String name, Address next) {
        this.name = name;
        this.next = next;
    }

    public Address(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getNext() {
        return next;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNext(Address next) {
        this.next = next;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Address clonedAddress = (Address) super.clone();
        if (next != null) {
            clonedAddress.setNext((Address) next.clone());
        }
        return clonedAddress;
    }

    @Override
    public String toString() {
        return name;
    }

}
