package homework_7.garik_gharibyan;

import homework_7.garik_gharibyan.product.drink.AlcoholicDrink;
import homework_7.garik_gharibyan.product.drink.NonAlcoholicDrink;
import homework_7.garik_gharibyan.product.food.pizza.Ingredient;
import homework_7.garik_gharibyan.product.food.pizza.Pizza;
import homework_7.garik_gharibyan.product.food.pizza.PizzaType;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Printer printer = new Printer();

        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

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

        order.addProduct(NonAlcoholicDrink.COCA_COLA,2);
        order.addProduct(pizzaItaliano,2);
        order.addProduct(pizzaMargarita,10);
        order.addProduct(AlcoholicDrink.VODKA,2);

        printer.printOrderAttributes(order);
        printer.printCheck(order);


//        for (Product product: order.getProducts()) {
//            if (product == null){
//                break;
//            }
//            System.out.println(product.getName() + " " +  product.getQuantity() + " * " +  product.getPrice());
//        }
//
//        System.out.println(order.calculateTotalPriceOfOrder());

    }
}
