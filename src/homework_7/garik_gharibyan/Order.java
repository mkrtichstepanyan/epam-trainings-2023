package homework_7.garik_gharibyan;

import homework_7.garik_gharibyan.drink.Drink;
import homework_7.garik_gharibyan.food.Food;
import homework_7.garik_gharibyan.food.pizza.Pizza;

public class Order {
    private static final int MAX_FOOD_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;
    private int pizzaIndex;
    private int drinkIndex;
    private final int orderNumber;
    private Customer customer;
    private final Food[] foods = new Food[10];
    private final Drink[] drinks = new Drink[100];


    public int getOrderNumber() {
        return orderNumber;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Food[] getFoods() {
        return foods;
    }

    public Drink[] getDrinks() {
        return drinks;
    }


    Order() {
        orderNumber = initialId++;
    }

    public void addDrink(Drink drink) {
        drinks[drinkIndex++] = drink;
    }

    public void addFood(Food food) {
        if (food.quantity > MAX_FOOD_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }

        if (food.getClass() == Pizza.class) {
            Pizza pizza = (Pizza) food;

            int index = pizzaIndex++;
            String validPizzaName = getValidPizzaName(pizza.getName(), index);

            foods[index] = new Pizza(
                    validPizzaName, pizza.getPizzaType(),
                    pizza.getIngredients(), pizza.getQuantity());

        }
    }

    public double calculateTotalPriceOfOrder() {

        return calculateDrinkPriceOfOrder() + calculateFoodPriceOfOrder();
    }


    private double calculateDrinkPriceOfOrder() {
        double totalDrinkAmount = 0;
        for (Drink drink : drinks) {
            if (drink == null) {
                break;
            }
            totalDrinkAmount = drink.getPrice() * drink.getQuantity() + totalDrinkAmount;
        }
        return totalDrinkAmount;
    }

    private double calculateFoodPriceOfOrder() {

        double totalFoodAmount = 0;
        for (Food food : foods) {
            if (food == null) {
                break;
            }
            totalFoodAmount = food.calculatePrice() * food.getQuantity() + totalFoodAmount;
        }
        return totalFoodAmount;
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
}
