package homework_7.Qnarik_Khachatryan;

import homework_7.Qnarik_Khachatryan.exceptions.NameException;
import homework_7.Qnarik_Khachatryan.exceptions.PhoneNumberException;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        try {
            customer.setName("125");
        } catch (NameException n){
            System.out.println(n);
        }
        try {
            customer.setPhoneNumber("+0");
        } catch (PhoneNumberException p){
            System.out.println(p);
        };


        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};

//        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
//        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients, 5);
//        Pizza pizza = new Pizza("Margarita", PizzaType.CALZONE, 2);
//        pizza.addIngredient(Ingredient.CHEESE);
//        pizza.addIngredient(Ingredient.CORN);
        order.addPizza("Margarita", PizzaType.CALZONE, ingredients, 2);
        order.addDrink(DrinkType.Coca_Cola, "Cola", 2);
        Printer.printCheck(order);
    }
}
