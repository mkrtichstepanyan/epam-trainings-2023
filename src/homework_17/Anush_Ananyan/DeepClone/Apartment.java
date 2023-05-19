package homework_17.Anush_Ananyan.DeepClone;

public class Apartment implements Cloneable {
    private String street;

    private int apartmentNumber;

    public Apartment(String street, int apartmentNumber) {
        this.street = street;
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Apartment clonedAp = (Apartment) super.clone();
        clonedAp.setNumber(clonedAp.apartmentNumber);
        clonedAp.setStreet(clonedAp.street);
        return clonedAp;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return apartmentNumber;
    }

    public void setNumber(int number) {
        this.apartmentNumber = number;
    }

}
