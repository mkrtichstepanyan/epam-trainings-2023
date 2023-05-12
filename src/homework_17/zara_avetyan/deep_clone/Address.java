package homework_17.zara_avetyan.deep_clone;

public class Address implements Cloneable {
    private String name;
    private Address next;

    public Address(String name) {
        this.name = name;
    }

    public Address(String name, Address next) {
        this.name = name;
        this.next = next;

    }

    public Object clone() throws CloneNotSupportedException {
        Address clone = (Address) super.clone();
        if (next != null) {
            clone.setNext((Address) next.clone());
        }
        return clone;
    }

    public Address getNext() {
        return next;
    }

    public void setNext(Address next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return name;
    }
}
