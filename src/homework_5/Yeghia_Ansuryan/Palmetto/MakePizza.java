package homework_5.Yeghia_Ansuryan.Palmetto;

import java.util.ArrayList;

public class MakePizza {
    public static void main(String[] args) {

        Order order = new Order();

        System.out.println(order.getOrderNumber());
//        System.out.println(order.getOrderNumber());

        System.out.println();

        Customer customer = new Customer();

        System.out.println(customer.getCustomerNumber());
//        System.out.println(customer.getCustomerNumber());


        Pizza pizza = new Pizza("Margarita", "regular", 2);
        System.out.println(pizza.getName() + " " + pizza.getPizzaType() + " " + pizza.getQuantity());

        Ingredient tomatoPaste = Ingredient.getTomatoPaste();
        Ingredient cheese = Ingredient.getCheese();
        Ingredient salami = Ingredient.getSalami();
        Ingredient bacon = Ingredient.getBacon();
        Ingredient garlic = Ingredient.getGarlic();
        Ingredient corn = Ingredient.getCorn();
        Ingredient pepperoni = Ingredient.getPepperoni();
        Ingredient olives = Ingredient.getOlives();

        System.out.println(tomatoPaste.getNameIngredient() + " " + tomatoPaste.getPrice());
        System.out.println(pepperoni.getNameIngredient() + " " + pepperoni.getPrice());

        System.out.println();


    }
}
