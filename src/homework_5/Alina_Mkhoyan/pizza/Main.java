package homework_5.Alina_Mkhoyan.pizza;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margarita", PizzaType.REGULAR,2);
        pizza.addIngredients("Cheese");
        pizza.addIngredients("Bacon");
        pizza.addIngredients("Tomato paste");
        pizza.addIngredients("Olives");
        Pizza pizza1 = new Pizza("Pepperoni", PizzaType.CLOSED,4);
        pizza1.addIngredients("Pepperoni");
        pizza1.addIngredients("Olives");
        pizza1.addIngredients("Cheese");
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizza);
        pizzas.add(pizza1);
        Order order = new Order(pizzas);
        order.displayPizzaAttributes(pizza);
        order.displayPizzaAttributes(pizza1);
        CheckPrinter.printCheck(order);
    }
}
