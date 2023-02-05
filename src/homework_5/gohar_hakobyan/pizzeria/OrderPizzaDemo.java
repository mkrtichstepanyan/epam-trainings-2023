package homework_5.gohar_hakobyan.pizzeria;

import java.util.ArrayList;
import java.util.Arrays;

public class OrderPizzaDemo {
    public static void main(String[] args) {
        Order order = new Order(10001, 7717);
        order.addPizza("Margarita", new ArrayList<>(Arrays.asList("Tomato paste", "Pepper", "Garlic", "Bacon")), false, 2);
        order.addPizza("PepperoniOro", new ArrayList<>(Arrays.asList("Tomato paste", "Cheese", "Salami", "Olives")), false, 3);
        order.printCheck();

        Order order2 = new Order(10002, 4372);
        order2.addPizza("BasePZZ", new ArrayList<>(Arrays.asList("Tomato paste", "Cheese", "Salami", "Olives")), false, 12);
        order2.printCheck();
    }
}
