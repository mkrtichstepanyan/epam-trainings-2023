package homework_5.Karen_Sargsyan.Pizza;

public class Order {

    private static int orderNumber = 10000;
    private final Customer customer;
    private int index = 0;
    private Pizza[] pizzas;


    public Order(Customer customer) {
        this.customer = customer;
    }


    void addPizza(Pizza pizza) {
        if (index == 0) {
            pizzas = new Pizza[10];
        }
        if (index <= 9) {
            if (pizza.getNamePizza().length() < 4 || pizza.getNamePizza().length() > 20) {
                pizza.setNamePizza(customer.getCustomerName() + "_" + index);
            }
            pizzas[index++] = pizza;
        } else {
            System.out.println("You can't order more than 10 pizzas.");
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderNumber() {
        return orderNumber++;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public int getIndex() {
        return index;
    }

}
