package homework_7.Anna_Manukyan;

import java.time.LocalTime;

abstract class Order {

    int index;
    int orderNumber;
    Customer customer;

    Food[] foods = new Food[100];

    public LocalTime orderTime = LocalTime.now();
     abstract void addFood(Food food);

     abstract void printOrderAttributes();

     void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Food[] getFoods() {
        return foods;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }
}
