package homework_5.Ani_Barseghyan;

public class Order {
    private int orderNumber;
    private Customer customer;
    private int pizzaCount;
    private Pizza[] pizzas;

    public Order(Customer customer) {
        this.orderNumber = (int) Math.floor(Math.random() * 90000) + 10000;
        this.customer = customer;
        this.pizzaCount = 10;
        this.pizzas = new Pizza[10];
    }

    public Order(Customer customer, int pizzaCount) {
        this.orderNumber = (int) Math.floor(Math.random() * 90000) + 10000;
        this.customer = customer;
        this.pizzaCount = pizzaCount;
        this.pizzas = new Pizza[pizzaCount];
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getPizzaCount() {
        return pizzaCount;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza... pizza) {
        if (pizzaCount > 10) {
            System.out.println("You can order up to 10 pizzas");
        } else if (pizza == null) {
            System.out.println("Please add pizza to your order");
        }
        for (int i = 0; i < pizzas.length; i++) {
            pizzas = pizza;
        }
    }
}
