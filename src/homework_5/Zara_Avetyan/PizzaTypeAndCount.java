package homework_5.Zara_Avetyan;

import java.util.Scanner;

public class PizzaTypeAndCount {
    String name;
    double price;

    PizzaTypeAndCount(String name, double price) {
        this.name = name;
        this.price = price;
    }

    PizzaTypeAndCount() {
    }

    int chooseType() {
        PizzaTypeAndCount[] pizzaType = Pizza.pizzaType;
        System.out.println("Please choose a type of pizza:");
        for (int i = 0; i < pizzaType.length; i++) {
            System.out.println((i + 1) + ". " + pizzaType[i].name);
        }
        return new Scanner(System.in).nextInt();
    }

    int count() {
        System.out.println("How many pizzas do you want?");
        return new Scanner(System.in).nextInt();
    }
}
