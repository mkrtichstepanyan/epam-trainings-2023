package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

public class Apartment extends DynamicArray implements Cloneable {
    private String number;

    public Apartment(String number) {
        this.number = number;
    }

    public Apartment(Apartment apartment) {
        this.number = apartment.number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public Object clone(Object object) {
        if (object instanceof Apartment) {
            Apartment clone = new Apartment((Apartment) object);
            return clone;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "number='" + number + '\'' +
                '}';
    }
}
