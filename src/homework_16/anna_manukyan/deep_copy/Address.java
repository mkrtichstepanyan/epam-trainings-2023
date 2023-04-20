package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

class Address extends DynamicArray implements Cloneable {
    private Space space;

    public Address(Space space) {
        this.space = space;
    }

    public Address(Address address) {
        this.space = address.space;
    }

    @Override
    public String toString() {
        return "Address{" +
                "space=" + space +
                '}';
    }

    public Space getSpace() {
        return space;
    }

    @Override
    public Object clone(Object object) {
        if (object instanceof Address) {
            Address clone = new Address((Address) object);
            clone.space = (Space) space.clone(((Address) object).space);
            return clone;
        }
        return null;
    }

}
