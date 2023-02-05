package homework_5.Anna_Manukyan.Pizzeria;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Order {
    private int orderNumber;
    private Customer customer;
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
                pizzas.get(i).setName(customer.getNumber() + "_" + i);
            }
        }
    }

    public void printCheck() {
        System.out.println("Order: " + orderNumber);
        System.out.println("Client: " + customer.getNumber());
        double totalSum = 0;
        for (Pizza pizza : pizzaList) {
            System.out.println("Name: " + pizza.getName());
            System.out.println("_______________________");
            System.out.println("Pizza base (" + pizza.getPizzaType().getName() + ") " + (pizza.getBASE_COST() + pizza.getPizzaType().getCost()) + " €");
            printPizzaIngredients(pizza);
            System.out.println("_______________________");
            double pizzaAmount = pizza.calculatePizzaAmount(pizza);
            System.out.println("Amount: " + pizza.calculatePizzaAmount(pizza) + " €");
            System.out.println("Quantity " + pizza.getQuantity());
            System.out.println("_______________________");
            totalSum += pizzaAmount * pizza.getQuantity();
        }
        System.out.println("_______________________");
        System.out.println("Total amount " + totalSum + " €");
        System.out.println("_______________________");
        System.out.println("Order time " + orderTime.getHour() + ":" + orderTime.getMinute());
    }


    public void printPizzaIngredients(Pizza pizza) {
        List<Ingredient> ingredients = pizza.getIngredients();
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println(ingredients.get(i).getName() + " " + ingredients.get(i).getPrice() + " €");
        }
    }

    public void printPizzaInformation(Pizza pizza) {
        System.out.println("[ " + orderNumber + " : " + customer.getNumber() + " : " + pizza.getName() + " : " + pizza.getQuantity() + " ]");
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
