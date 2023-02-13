package homework_5.Anush_Ananyan.Pizza;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Order {

    private final int ORDER_NUMBER = (int) (Math.random() * 100000) + 1;
    private final Customer customer;

    private Pizza[] pizzas;

    private final LocalTime ORDER_TIME = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));


    public Order(Customer customer, Pizza[] pizzas) {
        this.customer = customer;
        this.pizzas = pizzas;
        checkPizzaName(pizzas);
    }

    private void checkPizzaName(Pizza[] pizzas) {
        for (Pizza pizza : pizzas) {
            String pizzaName = pizza.getPizzaName();
            if (pizzaName != null && pizzaName.length() >= 4 && pizzaName.length() <= 20 && pizzaName.matches("\\p{IsLatin}+")) {
                pizza.setPizzaName(pizzaName);
            } else {
                pizza.setPizzaName(getCustomer().getCustomerName() + "_" + ORDER_NUMBER);
            }
        }
    }

    private int getQuantity(Pizza[] pizzas) {
        int sumOfCount = 0;
        for (Pizza pizza : pizzas) {
            sumOfCount += pizza.getCount();
        }
        return sumOfCount;
    }

    public void checkQuantity(Pizza[] pizzas) {
        if (getQuantity(pizzas) >= 10) {
            System.out.println("You can't order more then 10 pizzas");
        }
    }

    public void displayingPizzaAttributes(Pizza[] pizzas) {
        for (Pizza pizza : pizzas) {
            System.out.println("[" + ORDER_NUMBER + ":" +
                    getCustomer().getCostumerNumber() + ":" +
                    pizza.getPizzaName() + ":" +
                    pizza.getCount() + "]");
        }
    }

    public int getOrderNumber() {
        return ORDER_NUMBER;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public LocalTime getORDER_TIME() {
        return ORDER_TIME;
    }
}





