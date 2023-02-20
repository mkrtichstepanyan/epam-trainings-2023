package homework_7_Hovhannes_Gspeyan.palmetto;

import homework_7_Hovhannes_Gspeyan.palmetto.menu.*;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        MenuItem[] items = new MenuItem[3];
        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};
        Pizza pizza = new Pizza("Margarita", PizzaType.CALZONE, ingredients, 3);
        Pizza PepperoniOro = new Pizza("PepperoniOro", PizzaType.REGULAR, ingredients, 2);

        Drink drink = new Drink(DrinkType.SODA_DRINK,2);
        items[0] = pizza;
        items[1] = PepperoniOro;
        items[2] = drink;

        Order order = Order.createOrder(items, customer);
        order.setCustomer(customer);

        Printer.printCheck(order,pizza);

        MenuItem[] items1 = new MenuItem[3];
        Ingredient[] ingredients1 = {Ingredient.GARLIC, Ingredient.BACON, Ingredient.TOMATO_PASTE};
        Pizza pizza1 = new Pizza("MyPizza", PizzaType.CALZONE, ingredients1, 3);
        Pizza PepperoniOro2 = new Pizza("PepperoniOro2", PizzaType.REGULAR, ingredients1, 2);

        Drink drink1 = new Drink(DrinkType.ALCOHOL_DRINK,2);
        items1[0] = pizza;
        items1[1] = PepperoniOro2;
        items1[2] = drink1;

        Order order1 = Order.createOrder(items1, customer);
        order1.setCustomer(customer);

        Printer.printCheck(order1,pizza1);
    }
}
