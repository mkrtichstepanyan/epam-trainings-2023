package homework_5.Diana_Melkonyan.pizza;

import java.time.LocalDateTime;
public class Order {
    private  int index;
    private final int orderNumber;
    private static int nextNumber = 10000;
    private final Customer customer;


    private final Pizza[] pizzas = new Pizza[10];
    private final LocalDateTime orderTime;


    public Order(Customer customer) {
        this.customer = customer;
        this.orderNumber = nextNumber++;
        this.orderTime = LocalDateTime.now();
    }

    public int getIndex() {
        return index;
    }



    public void addPizza(Pizza pizza) {
        if (pizzas.length <= index) {
            System.out.println("You can't order 10 pizzas");

        }
        if (pizza == null) {
            System.out.println("You  choose pizza");
        }
        pizzas[index++] = pizza;
    }

    public void showPizzaAtributes(Pizza pizza) {
        if (pizza != null) {
            System.out.println("[" + orderNumber + ":" + customer.getCustomerNumber() + ":" + pizza.getName() + pizza.quantity + "]");
        }
    }

    public void printCheck() {
        System.out.println("__________________________________");
        System.out.println("Order date and time: " + orderTime);
        System.out.println("Order: " + orderNumber);
        System.out.println("Client: " + customer.getCustomerNumber());
        double totalAmount = 0;
        totalAmount = getTotalAmount(totalAmount);
        System.out.println("Total Amount:" + totalAmount + "€");


    }

    private double getPrice(Pizza pizza, double price) {
        for (String ingredient : pizza.getIngredients()) {
            double ingredientPrice = switch (ingredient) {
                case "Tomato paste" -> 1;
                case "Cheese" -> 1;
                case "Salami" -> 1.5;
                case "Bacon" -> 1.2;
                case "Garlic" -> 0.3;
                case "Corn" -> 0.7;
                case "Pepperoni" -> 0.6;
                case "Olives" -> 0.5;
                default -> 0;

            };
            System.out.println(ingredient + " " + ingredientPrice + "€");
            price = price + ingredientPrice;
        }
        return price;
    }

    private double getTotalAmount(double totalAmount) {
        for (Pizza pizza : pizzas) {
            if (pizza == null) {
                continue;
            }

            System.out.println("Name: " + pizza.getName());
            System.out.println("________________________________");
            double price = 1;
            if (pizza.getType().equals("Calzone")) {
                price = price + 0.5;
            }
            System.out.println("Pizza price (" + pizza.getType() + ")" + price + "€");
            price = getPrice(pizza, price);
            System.out.println("_________________________________");
            System.out.println("Amount " + price + "€");
            System.out.println("Quantity " + pizza.getQuantity());
            System.out.println("__________________________________");
            totalAmount = totalAmount + price * pizza.getQuantity();
        }
        return totalAmount;
    }

}
