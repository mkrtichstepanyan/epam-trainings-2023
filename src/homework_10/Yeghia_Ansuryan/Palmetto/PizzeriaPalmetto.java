package homework_10.Yeghia_Ansuryan.Palmetto;

import homework_10.Yeghia_Ansuryan.Palmetto.check.Printer;
import homework_10.Yeghia_Ansuryan.Palmetto.customer.Customer;
import homework_10.Yeghia_Ansuryan.Palmetto.order.Order;
import homework_10.Yeghia_Ansuryan.Palmetto.product.entities.Pizza;
import homework_10.Yeghia_Ansuryan.Palmetto.product.entities.Product;
import homework_10.Yeghia_Ansuryan.Palmetto.enums.IngredientPizza;
import homework_10.Yeghia_Ansuryan.Palmetto.enums.PizzaType;

public class PizzeriaPalmetto {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Elon Musk");
        customer.setPhoneNumber("+18006138840");

        Order order = new Order(customer);

        IngredientPizza[] ingredients = {IngredientPizza.CHEESE, IngredientPizza.SALAMI, IngredientPizza.TOMATO_PASTE};

        Product pizza = new Pizza("Margarita", PizzaType.CALZONE, ingredients, 4);

        order.addProduct(pizza);

        Printer.printCheck(order);

    }
}
