package homework_7.gohar_hakobyan;

import homework_7.gohar_hakobyan.drink.Drink;
import homework_7.gohar_hakobyan.drink.DrinkType;
import homework_7.gohar_hakobyan.exception.NameFormatException;
import homework_7.gohar_hakobyan.exception.ObjectNotFoundException;
import homework_7.gohar_hakobyan.exception.PhoneNumberFormatException;
import homework_7.gohar_hakobyan.pizza.Ingredient;
import homework_7.gohar_hakobyan.pizza.Pizza;
import homework_7.gohar_hakobyan.pizza.PizzaType;
import homework_7.gohar_hakobyan.product.Product;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();

        try {
            customer.setName("Sevak");
        } catch (NameFormatException e) {
            System.out.println(e);
        }

        try {
            customer.setPhoneNumber("+37488888888");
        } catch (PhoneNumberFormatException p) {
            System.out.println(p);
        }

        Product[] products = new Product[3];

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};
        Pizza pizza = new Pizza("Margarita", PizzaType.CALZONE, ingredients, 10);
        Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.REGULAR, ingredients, 5);

        Drink drink = new Drink(DrinkType.PEPSI, 2);
        products[0] = pizza;
        products[1] = pepperoniOro;
        products[2] = drink;

        Order order = Order.makeOrder(products, customer);
        order.setCustomer(customer);

        try {
            Printer.printCheck(order);
        } catch (ObjectNotFoundException e) {
            System.out.println(e);
        }
    }
}
