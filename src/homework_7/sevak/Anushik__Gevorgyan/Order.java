package homework_7.sevak.Anushik__Gevorgyan;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[10];
    private int index;


    Order() {

        orderNumber = initialId++;
    }

    public void addProduct(String productName, PizzaType type,
                         Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(productName, pizzaIndex);
       pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            validPizzaName = customer.getName() + "_" + pizzaIndex;
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }

    public void setCustomer(Customer customer) {

        this.customer = customer;
    }

    public double calculateOrderPrice() {
        double price = 0.0;
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                price = price + pizza.calculatePrice();
            }
        }


        return price;
    }


    public void printOrderAttributes() {
        for (Product product : pizzas) {
            System.out.println("[" + orderNumber + customer.getNumber() + product.getName() + product.getQuantity() + "]");
        }
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Pizza[] getProduct() {
        return pizzas;
    }


}
