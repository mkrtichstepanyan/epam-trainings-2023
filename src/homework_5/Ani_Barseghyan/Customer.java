package homework_5.Ani_Barseghyan;

public class Customer {
    private int customerNumber;

    Customer() {
        this.customerNumber = (int) Math.floor(Math.random() * 10000) + 1;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
}
