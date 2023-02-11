package homework_5.Karen_Sargsyan.Pizza;

public class Order {

    private int orderNumber;

    public Order() {
        orderNumber = 10000;
    }

    public int getOrderNumber() {
        return orderNumber++;
    }

}
