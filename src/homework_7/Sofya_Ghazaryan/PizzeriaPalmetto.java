package homework_7.Sofya_Ghazaryan;

import homework_7.Sofya_Ghazaryan.Pizza.model.*;
import homework_7.Sofya_Ghazaryan.Pizza.printer.Printer;

import java.util.Scanner;

public class PizzeriaPalmetto {

    public static void main(String[] args) {

        User user = new User();
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();


        System.out.println("Please input your name.");
        String name = scanner.nextLine();
        System.out.println("Please input your Phone Number");
        String phoneNumber = scanner.nextLine();

        user.setUserName(name);
        user.setPhoneNumber(phoneNumber);
        System.out.println("User was registered!!!");

        System.out.println(user.getUserName() + "  " + user.getPhoneNumber() + "   " + user.getUserNumber());


        Pizza margarita = new Pizza("Margarita", PizzaType.CALZONE, 2);
        margarita.addIngredient(Ingredient.PEPPERONI);
        margarita.addIngredient(Ingredient.CHEESE);
        margarita.addIngredient(Ingredient.TOMATO_PASTE);
        margarita.addIngredient(Ingredient.OLIVES);

        Order order = new Order();
        order.setUser(user);

        order.addProduct(margarita.getName(), margarita.getProductType(),
                margarita.getIngredients(), margarita.getQuantity());

        order.addDrink(Drink.ORANGE_JUICE, 5);
        order.addDrink(Drink.COCA_COLA, 2);

        printer.printCheck(order);
    }
}