package homework_5.Vladimir_Vanyan.Pizza_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Order {
    public int orderNumber;
    public int costomerNumber;
    Random r = new Random();
    private int low = 10000;
    private int high = 99999;

    Pizza pizza;

    public Order(Pizza pizza) {
        this.pizza = pizza;
        costomerNumber = r.nextInt(high - low) + low;
        orderNumber=r.nextInt(high-low)+low;
        calculatePrice();
    }

    public void calculatePrice() {

        if (pizza.type == "Calzone" || pizza.type == "calzone") {
            pizza.price += 0.5;
        }
        for (int i = 0; i < pizza.ingredients.size(); i++) {
            switch (pizza.ingredients.get(i)) {
                case "Cheese":
                    pizza.price += 1;
                    break;
                case "Salami":
                    pizza.price += 1.5;
                    break;
                case "Bacon":
                    pizza.price += 1.2;
                    break;
                case "Garlic":
                    pizza.price += 0.3;
                    break;
                case "Corn":
                    pizza.price += 0.7;
                    break;
                case "Pepperoni":
                    pizza.price += 0.6;
                    break;
                case "Olives":
                    pizza.price += 0.5;
                    break;
            }
        }
    }
    public void showInfo(){
     System.out.println("Order "+this.orderNumber);
        System.out.println("Costomer "+this.costomerNumber);
        System.out.println("Name "+pizza.costomerName );
        System.out.println("Quantity "+pizza.quantity);
        System.out.println("Price "+pizza.price* pizza.quantity);
    }
}
