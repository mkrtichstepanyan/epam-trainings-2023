package homework_5.Vladimir_Vanyan.Pizza_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Costomer margarite = new Costomer("Margarita", "Pepperoni", "Calzone", 5);
        Pizza pizza = margarite.orderInfo();
        Order margariteOrder = new Order(pizza);
        margariteOrder.showInfo();
    }
}
