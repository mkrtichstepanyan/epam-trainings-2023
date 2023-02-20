package homework_7.garik_gharibyan;

import homework_7.garik_gharibyan.drink.AlcoholicDrink;
import homework_7.garik_gharibyan.drink.NonAlcoholicDrink;
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

        Order order = new Order();
        order.setCustomer(customer);


        order.addPizza(pizzaMargarita);
        order.addPizza(pizzaItaliano);

        order.addDrink(NonAlcoholicDrink.COCA_COLA,2);
        order.addDrink(NonAlcoholicDrink.PEPSI,4);
        order.addDrink(NonAlcoholicDrink.ORANGE,4);

        order.addDrink(AlcoholicDrink.WINE,2);
        order.addDrink(AlcoholicDrink.VODKA,3);


        printer.printOrderAttributes(order);
        printer.printCheck(order);

    }
}
