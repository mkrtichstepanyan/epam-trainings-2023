package homework_5.Inesa_Mkrtchyan.Pizza;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Pizza> pizzas;
    private final int orderIndex;
    private double totalAmount;

    public Order() {
        this.customer = new Customer("");
        this.pizzas = new ArrayList<>();
        this.orderIndex = Helper.rand.nextInt(10000,99999);
    }
    public void addPizza(Pizza pizza){
        pizza.setName(pizza.getName(),customer);
        pizzas.add(pizza);
        totalAmount += pizza.getAmount();
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public double getTotalAmount(){
        return totalAmount;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    public Customer getCustomer() {
        return customer;
    }

    public int getOrderIndex() {
        return orderIndex;
    }

}
