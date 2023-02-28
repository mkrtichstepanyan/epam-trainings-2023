package homework_7.aram;



public class Order {
    private static final int MAX_PRODUCT_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int orderNumber;
    private Customer customer;
    private Product[] products = new Product[10];

    Order() {
        orderNumber = initialId++;
    }

    public void addProduct(Product product) {
        ProductType productType=product.productType;
        if (product.getQuantity() > MAX_PRODUCT_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        if (productType == ProductType.PIZZA) {
            Pizza pizza = (Pizza) product;
            int pizzaIndex = index++;
            String validPizzaName = getValidPizzaName(pizza.getName(), pizzaIndex);
            products[pizzaIndex] = new Pizza(validPizzaName, pizza.getPizzaType(), pizza.getIngredients(), pizza.getQuantity(), productType);
        }
        if (productType == ProductType.DRINK) {
            Drink drinks = (Drink) product;
            int drinksIndex = index++;
            products[drinksIndex] = new Drink(drinks.getName(), drinks.getDrinkType(), drinks.getQuantity(),productType);
        }

    }



    public double calculateOrderPrice() {
        // todo calculate order total price
        double total = 0.0;
        for (Product product : products) {
            if (product != null) {
                total += product.calculatePrice() * product.getQuantity();
            }

        }

        return total;
    }


    public void printOrderAttributes() {
        for (Product product : products) {
            System.out.println("[" + orderNumber + customer.getNumber() + product.getName() + product.getQuantity() + "]");
        }
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

    public int getOrderNumber() {
        return orderNumber;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Product[] getProducts() {
        return products;
    }


}
