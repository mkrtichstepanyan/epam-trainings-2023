package homework_7.garik_gharibyan;

import homework_7.garik_gharibyan.drink.AlcoholicDrink;
import homework_7.garik_gharibyan.drink.DrinkNonAlcoholic;
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
        order.addDrink(DrinkNonAlcoholic.COCA_COLA,2);
        order.addDrink(DrinkNonAlcoholic.PEPSI,4);
        order.addDrink(DrinkNonAlcoholic.FANTA,2);
        order.addDrink(AlcoholicDrink.WINE,2);
        order.addDrink(AlcoholicDrink.VODKA,3);


        printer.printOrderAttributes(order);
        printer.printCheck(order);

    }
}
