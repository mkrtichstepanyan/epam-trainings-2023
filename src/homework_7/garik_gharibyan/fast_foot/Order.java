package homework_7.garik_gharibyan.fast_foot;

import homework_7.garik_gharibyan.fast_foot.foots.Food;
import homework_7.garik_gharibyan.fast_foot.foots.pizza.Pizza;

public class Order {
    private static int lastOrderNumber = 10000;
    private final int orderNumber;
    private final Food[] foods;
    private final Customer customer;

    private Order(Food[] foods, int orderNumber, Customer customer) {
        this.foods = foods;
        this.orderNumber = orderNumber;
        this.customer = customer;
        isValidPizzaName(foods);

    }


    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Food[] getFoods() {
        return foods;
    }


    public static Order makeOrder(Food[] foods, Customer customer) {
        return new Order(foods, lastOrderNumber++, customer);
    }

    public double calculateTotalAmountOfOrder() {
        double totalAmount = 0;
        for (Food food : foods) {
            totalAmount = food.getPrice() * food.getQuantity() + totalAmount;
        }
        return totalAmount;
    }

    void isValidPizzaName(Food[] foods) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].getClass() == Pizza.class) {
                if (foods[i].getName() == null || foods[i].getName().length() < 4 || foods[i].getName().length() > 20) {
                    foods[i].setName(customer.getName() + "_" + customer.getNumber());
                }
            }

        }
    }

}
