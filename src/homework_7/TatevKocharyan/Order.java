package homework_7.TatevKocharyan;

public class Order {
    private static final int MAX_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 1000;
    private static int initialId = BASE_ORDER_NUMBER;
    private int index;
    private int orderNumber;
    private Customer customer;
    private Product[] products = new Product[MAX_AMOUNT];


    Order() {
        orderNumber = initialId++;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProducts() {
        return products;
    }


    public void addProduct(String myDrink, DrinkType type, int quantity) {
        if (quantity > MAX_AMOUNT) {
            System.out.println("You can't order more than 10 ");
            return;
        }
        int drinkIndex = index++;
        products[drinkIndex] = new Drink(myDrink, type, quantity);
    }


    public void addProduct(String productName, ProductType type, Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_AMOUNT) {
            System.out.println("You can't order more than 10 ");
            return;
        }
        int pizzaIndex = index++;
        String validName = getValidPizzaName(productName, pizzaIndex);
        products[pizzaIndex] = new Pizza(validName, type, ingredients, quantity);

    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            validPizzaName = customer.getCustomerName() + " " + pizzaIndex;
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }

    public void setCusomer(Customer customer) {
        this.customer = customer;
    }


    public double calculateOrderPrice(Order order) {
        double calculateOrderPrice = 0.0;
        Product[] products = order.products;
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof Pizza) {
                Pizza pizza = (Pizza) products[i];
                if (pizza != null) {
                    Ingredient[] ingredients = pizza.getIngredients();
                    for (int j = 0; j < ingredients.length; j++) {
                        calculateOrderPrice = calculateOrderPrice + ingredients[j].getPrice();
                    }
                    calculateOrderPrice += pizza.getProductType().getPrice();
                }
            }
            if (products[i] instanceof Drink) {
                Drink drink = (Drink) products[i];
                if (drink != null) {
                    calculateOrderPrice += drink.getProductType().getPrice();
                }
            }
            // todo calculate order total price+
        }
        return calculateOrderPrice;
    }

    public void printOrderAttributes() {
        for (Product product : products) {
            System.out.println("[" + orderNumber + customer.getCustomerNumber() + product.getName() + product.getQuantity() + "]");

        }
    }


}
