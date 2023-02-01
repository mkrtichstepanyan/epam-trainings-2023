package homework_5.Anna_Manukyan.Pizzeria;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Order {
    private int orderNumber;
    private int customerNumber;
    private ArrayList<Pizza> pizzaList;

    private LocalTime orderTime = LocalTime.now();

    public Order() {
        pizzaList = new ArrayList<>(10);
        this.orderNumber = new Random().nextInt(100000);
    }

    public void createValidName(ArrayList<Pizza> pizzas) {
        for (int i = 0; i < pizzas.size(); i++) {
            String pizzaName = pizzas.get(i).getName();
            if (pizzaName.length() < 4 || pizzaName.length() > 20) {
                pizzas.get(i).setName(customerNumber + "_" + i);
            }
        }
    }

    public void printCheck() {
        System.out.println("Order: " + orderNumber);
        System.out.println("Client: " + customerNumber);
        double totalSum = 0;
        for (Pizza pizza : pizzaList) {
            System.out.println("Name: " + pizza.getName());
            System.out.println("_______________________");
            System.out.println("Pizza base (" + pizza.getPizzaType().getName() + ") " + (pizza.getBASE_COST() + pizza.getPizzaType().getCost()) + " €");
            printPizzaIngredients(pizza);
            System.out.println("_______________________");
            double pizzaAmount = calculatePizzaAmount(pizza);
            System.out.println("Amount: " + calculatePizzaAmount(pizza) + " €");
            System.out.println("Quantity " + pizza.getQuantity());
            totalSum += pizzaAmount;
        }
        System.out.println("_______________________");
        System.out.println("Total amount " + totalSum + " €");
        System.out.println("_______________________");
        System.out.println("Order time " + orderTime.getHour() + ":" + orderTime.getMinute());
    }

    public double calculatePizzaAmount(Pizza pizza) {
        double sum = 0;
        List<Ingredient> ingredients = pizza.getIngredients();
        for (int i = 0; i < ingredients.size(); i++) {
            sum += ingredients.get(i).getPrice();
        }
        return sum;
    }

    public void printPizzaIngredients(Pizza pizza) {
        List<Ingredient> ingredients = pizza.getIngredients();
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println(ingredients.get(i).getName() + " " + ingredients.get(i).getPrice() + " €");
        }
    }

    public void printPizzaInformation(Pizza pizza) {
        System.out.println("[ " + orderNumber + " : " + customerNumber + " : " + pizza.getName() + " : " + pizza.getQuantity() + " ]");
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public ArrayList<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(ArrayList<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }
}
