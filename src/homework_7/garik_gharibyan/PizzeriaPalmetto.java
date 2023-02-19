package homework_7.garik_gharibyan;

import homework_7.garik_gharibyan.drink.Drink;
import homework_7.garik_gharibyan.drink.DrinkType;
import homework_7.garik_gharibyan.food.pizza.Ingredient;
import homework_7.garik_gharibyan.food.pizza.Pizza;
import homework_7.garik_gharibyan.food.pizza.PizzaType;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Printer printer = new Printer();

        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Pizza pizzaMargarita = new Pizza("Margarita", PizzaType.CALZONE, 5);
        pizzaMargarita.addIngredient(Ingredient.BACON);
        pizzaMargarita.addIngredient(Ingredient.TOMATO_PASTE);

        Pizza pizzaItaliano = new Pizza("Italiano", PizzaType.REGULAR, 2);
        pizzaItaliano.addIngredient(Ingredient.CORN);
        pizzaItaliano.addIngredient(Ingredient.PEPERONI);
        pizzaItaliano.addIngredient(Ingredient.TOMATO_PASTE);
        pizzaItaliano.addIngredient(Ingredient.CHEESE);

        Pizza pizza3 = new Pizza("", PizzaType.CALZONE, 5);
        pizza3.addIngredient(Ingredient.BACON);
        pizza3.addIngredient(Ingredient.TOMATO_PASTE);


        Order order = new Order();
        order.setCustomer(customer);
        order.addFood(pizzaMargarita);
        order.addFood(pizzaItaliano);
        order.addFood(pizza3);
        order.addDrink(new Drink(DrinkType.COCA_COLA, 10));


        printer.printOrderAttributes(order);
        printer.printCheck(order);

    }
}
