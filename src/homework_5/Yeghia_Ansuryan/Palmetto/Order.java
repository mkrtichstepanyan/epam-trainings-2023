package homework_5.Yeghia_Ansuryan.Palmetto;

public class Order {
    private final Customer customer;
    private static int orderNumber = 10000;
    private Pizza[] pizzas;
    private int pizzaIndex = 0;

    public Order(Customer customer) {
        this.customer = customer;
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

    public int getPizzaIndex() {
        return pizzaIndex;
    }

    void addPizza(Pizza pizza) {
        if (pizzaIndex == 0) {
            pizzas = new Pizza[10];
        }
        if (pizzaIndex <= 9) {
            if (pizza.getPizzaName().length() < 4 || pizza.getPizzaName().length() > 20) {
                pizza.setPizzaName(customer.getCustomerName() + "_" + pizzaIndex);
            }
            pizzas[pizzaIndex++] = pizza;
        } else {
            System.out.println("You can't order more than 10 pizzas");
        }
    }
}
