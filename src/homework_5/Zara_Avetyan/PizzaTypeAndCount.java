package homework_5.Zara_Avetyan;

import java.util.Scanner;

public class PizzaTypeAndCount {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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
        System.out.println("Press number 1-2");
        return new Scanner(System.in).nextInt();
    }

    int count() {
        System.out.println("How many pizzas do you want?");
        return new Scanner(System.in).nextInt();
    }
}
