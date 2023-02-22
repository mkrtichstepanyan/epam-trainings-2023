package homework_7.Ani_Kovalenko;

public class Order {
    public static final String PRODUCT_PIZZA = "Pizza";
    public static final String PRODUCT_BURGER = "Burger";
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;
    private int index;
    private double totalPrice = 0.0;
    private int orderNumber;
    private Customer customer;
    private Item[] items = new Item[10];

    Order(Customer customer) {
        this.customer = customer;
        orderNumber = initialId++;
    }

//    public void addBurger(String product, String burgerName, BurgerBreadType breadType,
//                          IngredientBurger[] ingredients, int quantity) {
//        String validBurgerName = getValidItemName(burgerName, index);
//        Item item = new Burger(product, validBurgerName, breadType, ingredients, quantity);
//        addItem(item);
//    }
//
//    public void addPizza(String product, String pizzaName, PizzaType type,
//                         IngredientPizza[] ingredients, int quantity) {
//        String validPizzaName = getValidItemName(pizzaName, index);
//        Item item = new Pizza(product, validPizzaName, type, ingredients, quantity);
//        addItem(item);
//    }

    void addItem(Item item) {
        if (index > MAX_PIZZA_AMOUNT) {
            System.out.println("You are not allowed to order more than 10 products.");
            return;
        }
        item.setName(getValidItemName(item.getName(), index));
        items[index++] = item;
    }

    private String getValidItemName(String itemName, int itemIndex) {
        String validItemName = itemName;
        if (!isValidItemName(itemName)) {
            validItemName = customer.getName() + "_" + itemIndex;
        }
        return validItemName;
    }

    private boolean isValidItemName(String itemName) {
        return itemName != null && itemName.length() > 4 && itemName.length() < 20;
    }

    public double calculateOrderPrice(Item[] items) {
        for (int i = 0; i <= index; i++) {
            if (items[i] != null) {
                double eachItemPrice = items[i].calculatePrice() * items[i].getQuantity();
                this.totalPrice += eachItemPrice;
            }
        }
        return totalPrice;
    }

    public void printOrderAttributes() {
        for (Item item : items) {
            System.out.println("[" + orderNumber + customer.getNumber() + item.getName() + item.getQuantity() + "]");
        }
    }

    public Item[] getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}
