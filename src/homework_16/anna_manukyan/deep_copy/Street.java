package homework_16.anna_manukyan.deep_copy;

import homework_16.anna_manukyan.generic_dynamic_array.DynamicArray;

public class Street extends DynamicArray implements Cloneable {
    private String name;

    private Apartment apartment;

    public Street(String name, Apartment apartment) {
        this.name = name;
        this.apartment = apartment;
    }

    public Street(Street street) {
        this.name = street.name;
        this.apartment = street.apartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    @Override
    public Object clone(Object object) {
        if (object instanceof Address) {
            Street clone = new Street((Street) object);
            clone.apartment = (Apartment) apartment.clone(((Street) object).apartment);
            return clone;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", apartment=" + apartment +
                '}';
    }
}
