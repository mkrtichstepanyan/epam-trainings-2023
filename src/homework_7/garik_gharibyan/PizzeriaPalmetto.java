package homework_7.garik_gharibyan;

import homework_7.garik_gharibyan.exceptions.NameException;
import homework_7.garik_gharibyan.exceptions.PhoneNumberException;
import homework_7.garik_gharibyan.product.drink.AlcoholicDrink;
import homework_7.garik_gharibyan.product.drink.NonAlcoholicDrink;
import homework_7.garik_gharibyan.product.food.pizza.Ingredient;
import homework_7.garik_gharibyan.product.food.pizza.Pizza;
import homework_7.garik_gharibyan.product.food.pizza.PizzaType;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Printer printer = new Printer();

        Customer customer = new Customer();
        try {
            customer.setName("Sevak");
            System.out.println("CustomerName: " + customer.getName());
        }catch (NameException e){
            System.out.println(e);
        }
        try {
            customer.setPhoneNumber("+37498000000");
            System.out.println("Phone number: " + customer.getPhoneNumber());
        }catch (PhoneNumberException e){
            System.out.println(e);
        }

        Pizza pizzaMargarita = new Pizza("Margarita", PizzaType.CALZONE);

        Pizza pizzaItaliano = new Pizza("Italiano", PizzaType.REGULAR);
        pizzaItaliano.addIngredient(Ingredient.CORN);
        pizzaItaliano.addIngredient(Ingredient.PEPERONI);
        pizzaItaliano.addIngredient(Ingredient.TOMATO_PASTE);
        pizzaItaliano.addIngredient(Ingredient.CHEESE);
        pizzaItaliano.addIngredient(Ingredient.BACON);
        pizzaItaliano.addIngredient(Ingredient.GARLIC);

        Order order = new Order();
        order.setCustomer(customer);

        order.addProduct(NonAlcoholicDrink.COCA_COLA, 10);
        order.addProduct(NonAlcoholicDrink.COCA_COLA, 7);
        order.addProduct(NonAlcoholicDrink.PEPSI, 2);
        order.addProduct(NonAlcoholicDrink.APPLE, 1);
        order.addProduct(NonAlcoholicDrink.ORANGE, 1);
        order.addProduct(pizzaItaliano, 2);
        order.addProduct(pizzaItaliano, 2);
        order.addProduct(pizzaMargarita, 10);
        order.addProduct(AlcoholicDrink.VODKA, 4);

        printer.printOrderAttributes(order);
        printer.printCheck(order);

    }
}
