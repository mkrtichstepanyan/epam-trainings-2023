package homework_5.Ani_Kovalenko.Pizza_With_System.in;

import java.util.Scanner;

public class Order {
    private static int orderNumber = 10001;
    private static int index = 0;
    private Pizza[] pizzaArray = new Pizza[10];
    private Customer customer;
    private double priceTotal = 0.0;

    public Order(Customer customer) {
        this.customer = customer;
    }

    void addPizza(Pizza pizza) {
        if (pizza.getPizzaName().length() <= 4 || pizza.getPizzaName().length() >= 20) {
            pizza.setPizzaName(customer.getName() + "_" + getIndex());
        }
        if (index == 10) {
            System.out.println("Your basket is already full !");
        }
        if (calculateTotalCount(pizza) == false) {
            pizzaArray[index++] = pizza;
        }
    }

    boolean calculateTotalCount(Pizza pizza) {
        int totalCount = 0;
        for (int i = 0; i < index; i++) {
            totalCount += pizzaArray[i].getPizzaCount();
        }
        totalCount += pizza.getPizzaCount();
        if (totalCount >= 10) {
            System.out.println("Your basket is already full !");
            return true;
        }
        return false;
    }

    public double calculatePriceTotal() {
        for (int i = 0; i < index; i++) {
            priceTotal += pizzaArray[i].getPrice();
        }
        return priceTotal;
    }

    public void nextPizzaCall() {
        Scanner console = new Scanner(System.in);
        System.out.println("Do you want to add one more pizza? y/n");
        char choice = console.next().charAt(0);
        if (choice == 'n') {
            CheckPrinter checkPrinter = new CheckPrinter();
            checkPrinter.printCheck(this);
        } else if (choice == 'y') {
            System.out.println("So please select the ingredients for the next one.");
            System.out.println();
        }
    }

    public int getOrderNumber() {
        return orderNumber++;
    }

    public static int getIndex() {
        return index;
    }

    public int getCustomerNumber() {
        return 0;
    }

    public Pizza[] getPizzaArray() {
        return pizzaArray;
    }

    public Customer getCustomer() {
        return customer;
    }
}
