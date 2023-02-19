package homework_7.gohar_hakobyan;

import homework_7.gohar_hakobyan.drink.Drink;
import homework_7.gohar_hakobyan.drink.DrinkType;
import homework_7.gohar_hakobyan.pizza.Ingredient;
import homework_7.gohar_hakobyan.pizza.Pizza;
import homework_7.gohar_hakobyan.pizza.PizzaType;
import homework_7.gohar_hakobyan.product.Product;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");
        Product[] products = new Product[3];

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};
        Pizza pizza = new Pizza("Margarita", PizzaType.CALZONE, ingredients, 10);
        Pizza PepperoniOro = new Pizza("PepperoniOro", PizzaType.REGULAR, ingredients, 5);

        Drink drink = new Drink(DrinkType.PEPSI, 2);
        products[0] = pizza;
        products[1] = PepperoniOro;
        products[2] = drink;

        Order order = Order.makeOrder(products, customer);
        order.setCustomer(customer);



        Printer.printCheck(order);
    }
}
