package homework_7.Roza_Petrosyan;

import homework_7.Roza_Petrosyan.ingredient.*;
import homework_7.Roza_Petrosyan.printer.*;
import homework_7.Roza_Petrosyan.productType.*;
import homework_7.Roza_Petrosyan.product.*;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {PizzaIngredient.TOMATO_PASTE, PizzaIngredient.Bacon, PizzaIngredient.Garlic};
        Ingredient[] ingredients2 = {};


        order.addProduct("Margarita", PizzaType.CALZONE, ingredients, 1);
        order.addProduct("MyPizza2", PizzaType.REGULAR, ingredients2, 5);

        Pizza pizza2 = (Pizza) order.getProducts()[1];


        pizza2.addIngredient(PizzaIngredient.Corn);
        pizza2.addIngredient(PizzaIngredient.Pepperoni);
        pizza2.addIngredient(PizzaIngredient.Olives);


        order.addProduct("Sprite", DrinkType.FIZZY, null, 2);
        order.printOrderAttributes();


        Printer.printCheck(order);
    }
}
