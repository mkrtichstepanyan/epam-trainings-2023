package homework_7.Roza_Petrosyan;

import homework_7.Roza_Petrosyan.printer.*;
import homework_7.Roza_Petrosyan.productType.*;
import homework_7.Roza_Petrosyan.product.*;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("12");
        customer.setPhoneNumber("+3749800000011");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.TOMATO_PASTE, Ingredient.BACON, Ingredient.GARLIC};
        Ingredient[] ingredients2 = {Ingredient.BACON};


        order.addProduct("Mar", PizzaType.CALZONE, ingredients, 1);
        order.addProduct("MyPizza", PizzaType.REGULAR, ingredients2, 5);

        Pizza pizza2 = (Pizza) order.getProducts()[1];


        pizza2.addIngredient(Ingredient.CORN);
        pizza2.addIngredient(Ingredient.PEPPERONI);
        pizza2.addIngredient(Ingredient.OLIVES);


        order.addProduct("Sprite", DrinkType.FIZZY, null, 2);
        order.printOrderAttributes();


        Printer.printCheck(order);
    }
}
