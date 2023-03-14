package homework_10.anna_manukyan.pizzeria;

import homework_10.anna_manukyan.pizzeria.CustomExceptions.PhoneNumberException;
import homework_10.anna_manukyan.pizzeria.CustomExceptions.ProductTypeException;
import homework_10.anna_manukyan.pizzeria.enums.Ingredient;
import homework_10.anna_manukyan.pizzeria.enums.PizzaType;
import homework_10.anna_manukyan.pizzeria.enums.ProductType;
import homework_10.anna_manukyan.pizzeria.pizza.Pizza;
import homework_10.anna_manukyan.pizzeria.validators.Validator;

import java.util.List;

public class PizzeriaPalmetto {

    public static void main(String[] args) throws IllegalAccessException, ProductTypeException {
        Customer customer = new Customer();
        customer.setName("Sevak");
        try {
            customer.setPhoneNumber("+1000000000001");
            Order orderForPizza = new Order();
            orderForPizza.setCustomer(customer);

            Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};

            Pizza pizza1 = new Pizza("MyPizza", PizzaType.CALZONE, ingredients, 10, ProductType.PIZZA);
            Pizza pizza2 = new Pizza("MyPizza2", PizzaType.REGULAR, ingredients, 5, ProductType.PIZZA);
            orderForPizza.addFood(pizza1);
            orderForPizza.addFood(pizza2);
            List<String> validate = Validator.validate(orderForPizza);
            if (validate.size() != 0) {
                Printer.printErrors(validate);
            } else {
                Printer.printCheck(orderForPizza);
            }
        } catch (PhoneNumberException e) {
            System.out.println(e);
        }


        Customer customer1 = new Customer();
        customer1.setName("First customer");

        Order firstOrderForPizza = new Order();
        firstOrderForPizza.setCustomer(customer1);

        Ingredient[] ingredientsForMargarita = {Ingredient.TOMATO_PASTE, Ingredient.GARLIC, Ingredient.BACON};
        Ingredient[] ingredientsForPepperoniOro = {Ingredient.TOMATO_PASTE, Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.OLIVES};
        Pizza pizzaBasePZZ = new Pizza("BasePZZ", PizzaType.CALZONE, ingredientsForPepperoniOro, 12, ProductType.PIZZA);


        Pizza margarita = new Pizza("Margarita", PizzaType.REGULAR, ingredientsForMargarita, 2, ProductType.PIZZA);
        Pizza margarita1 = new Pizza("Margarita", PizzaType.REGULAR, null, 2, ProductType.PIZZA);
        Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.CALZONE, ingredientsForPepperoniOro, 3, ProductType.PIZZA);
        firstOrderForPizza.addFood(margarita);
        firstOrderForPizza.addFood(pepperoniOro);
        firstOrderForPizza.addFood(margarita1);
        List<String> validate = Validator.validate(firstOrderForPizza);
        if (validate.size() != 0) {
            Printer.printErrors(validate);
        } else {
            Printer.printCheck(firstOrderForPizza);
        }

    }
}
