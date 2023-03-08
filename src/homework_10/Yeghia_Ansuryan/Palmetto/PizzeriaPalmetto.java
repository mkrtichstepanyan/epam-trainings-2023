package homework_10.Yeghia_Ansuryan.Palmetto;

import homework_10.Yeghia_Ansuryan.Palmetto.myExceptions.DoubleIngredientException;
import homework_10.Yeghia_Ansuryan.Palmetto.myExceptions.LatinNameException;
import homework_10.Yeghia_Ansuryan.Palmetto.myExceptions.PhoneNumberException;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        try {
            Customer customer = new Customer();
            customer.setName("Elon Musk");
            customer.setPhoneNumber("+18006138840");

            Order order = new Order(customer);

            IngredientPizza[] ingredients = {IngredientPizza.CHEESE, IngredientPizza.SALAMI, IngredientPizza.TOMATO_PASTE};

            Product pizza = new Pizza("Ma", PizzaType.CALZONE, ingredients, 4);

            order.addProduct(pizza);

            Printer.printCheck(order);
        } catch (DoubleIngredientException | LatinNameException | PhoneNumberException e) {
            System.err.println(e);
            System.err.println("Pleas retry and enter a correct information !");
        }
    }
}
