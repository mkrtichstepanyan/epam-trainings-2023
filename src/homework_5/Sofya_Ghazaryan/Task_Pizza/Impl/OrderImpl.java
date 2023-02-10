package homework_5.Sofya_Ghazaryan.Task_Pizza.Impl;

import homework_5.Sofya_Ghazaryan.Task_Pizza.model.Customer;
import homework_5.Sofya_Ghazaryan.Task_Pizza.model.Order;
import homework_5.Sofya_Ghazaryan.Task_Pizza.model.Pizza;
import homework_5.Sofya_Ghazaryan.Task_Pizza.model.Type;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OrderImpl {
    List<Order> orderList = new ArrayList<>();
    List<Pizza> pizzaList = new ArrayList<>();


    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void addPizza(Pizza pizza) {
        this.pizzaList.add(pizza);
    }

    public void showPizzaAttributes(Order order) {
        for (Pizza pizza :
                pizzaList) {
            System.out.println("[ " + order.getOrderNumber() + " : " + order.getCustomer().getCustomerNumber() + " : "
                    + pizza.getName() + " : " + pizza.getQuantity() + " ]");
        }
    }

    public void printCheck(Order order) {
        double totalPrice = 0;
        double ingredientPrice = 0;
        double basePrice = 0;
        double typePrice = 1;

        System.out.println("********************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getCustomerNumber());
        for (Pizza pizza : pizzaList) {
            System.out.println("Name: " + pizza.getName());
            System.out.println("----------------------");

            if (pizza.getType().equals(Type.CLOSED)) {
                typePrice += 0.5;
                System.out.println("Pizza Base (Calzone) " + typePrice + " $");
            } else {
                System.out.println("Pizza Base (Regular) " + typePrice + " $");
            }

            for (String ingredient : pizza.getIngredients()) {
                ingredientPrice = switch (ingredient) {
                    case "Tomato paste", "Cheese" -> 1;
                    case "Salami" -> 1.5;
                    case "Bacon" -> 1.2;
                    case "Garlic" -> 0.3;
                    case "Corn" -> 0.7;
                    case "Pepperoni" -> 0.6;
                    case "Olives" -> 0.5;
                    default -> 0;
                };
                basePrice += ingredientPrice;
                System.out.println(ingredient + " " + ingredientPrice + " $");
            }
            System.out.println("----------------------");
            System.out.println("Amount: " + (typePrice + basePrice));
            System.out.println("Quantity: " + pizza.getQuantity());
            System.out.println("----------------------");

            totalPrice = (typePrice + basePrice) * pizza.getQuantity();
        }
        System.out.println("Total amount: " + totalPrice + " $");
        System.out.println("----------------------");
        System.out.println("Order time: " + order.getOrderTime().format(DateTimeFormatter.ofPattern("d.MM.yyyy | hh:mm:ss")));
        System.out.println("********************************");
    }
}
