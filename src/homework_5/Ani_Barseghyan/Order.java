package homework_5.Ani_Barseghyan;

public class Order {
    private int orderNumber;
    private int customerNumber;

    public Order(){
        this.orderNumber = (int) Math.floor(Math.random() * 90000) + 10000;
        this.customerNumber=(int) Math.floor(Math.random() * 10000) + 1;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

}
