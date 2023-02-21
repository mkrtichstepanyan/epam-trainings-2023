package homework_7.Anna_Manukyan;

import java.time.LocalTime;

public class Order {

    private static final int MAX_ITEM_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;
    private int index;
    private int orderNumber;
    private Customer customer;
    private Food[] foods = new Food[10];

    public LocalTime orderTime = LocalTime.now();

    Order() {
        orderNumber = initialId++;
    }

    void addFood(Food food) {
        FoodType foodType = food.foodType;
        if (food.getQuantity() > MAX_ITEM_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        if (foodType == FoodType.PIZZA) {
            Pizza pizza = (Pizza) food;
            int pizzaIndex = index++;
            String validPizzaName = getValidPizzaName(pizza.getName(), pizzaIndex);
            foods[pizzaIndex] = new Pizza(validPizzaName, pizza.getPizzaType(), pizza.getIngredients(), pizza.getQuantity(), foodType);
        }
        if (foodType == FoodType.SWEETS) {
            Sweets sweets = (Sweets) food;
            int sweetsIndex = index++;
            foods[sweetsIndex] = new Sweets(sweets.getName(), sweets.getQuantity(), foodType);
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

    public double calculateOrderAmount() {
        double totalSum = 0;
        for (Food food : foods) {
            if (food!= null){
                totalSum += food.calculatePrice() * food.getQuantity();
            }
        }
        return totalSum;
    }

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
