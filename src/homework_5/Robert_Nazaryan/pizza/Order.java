package homework_5.Robert_Nazaryan.pizza;

import java.util.Random;

public class Order {

    private Pizza pizza = new Pizza();
    Random rand = new Random();
    private double price = 0;
    private final int order;
    private String name;
    private int CustomerNumber;
    private int quantity;
    private String pizzaType;
    private final double tomatoPrice = 1;
    private final double cheesePrice = 1;
    private final double salamiPrice = 1.5;
    private final double baconPrice = 1.2;
    private final double garlicPrice = 0.3;
    private final double cornPrice = 0.7;
    private final double pepperoniPrice = 0.6;
    private final double olivesPrice = 0.5;


    public Order(String name, String pizzaType, int quantity) {
        this.order = rand.nextInt(99999 - 10000) + 10000;
        this.CustomerNumber = rand.nextInt(9999 - 1000) + 1000;
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        if (name.length() >= 4 && name.length() <= 20) {
            this.name = name;
        } else {
            this.name = "customer_name_" + quantity;
        }
        if (this.pizzaType == "closed" || this.pizzaType == "Closed") {
            this.price = 1.5;
        } else {
            this.price = 1;
        }
    }

    public void orderInfo() {
        System.out.println("[ " + order + ": " + CustomerNumber + ": " + name + ": " + quantity + " ]");
    }

    public void addIngredient(String s) {
        if (pizza.getIndex() < 8) {
            pizza.push(s);
            switch (s) {
                case "Tomato":
                    this.price += tomatoPrice;
                    pizza.push(tomatoPrice);
                    break;
                case "tomato":
                    this.price += tomatoPrice;
                    pizza.push(tomatoPrice);
                    break;
                case "Cheese":
                    this.price += cheesePrice;
                    pizza.push(cheesePrice);
                    break;
                case "cheese":
                    this.price += cheesePrice;
                    pizza.push(cheesePrice);
                    break;
                case "Salami":
                    this.price += salamiPrice;
                    pizza.push(salamiPrice);
                    break;
                case "salami":
                    this.price += salamiPrice;
                    pizza.push(salamiPrice);
                    break;
                case "Bacon":
                    this.price += baconPrice;
                    pizza.push(baconPrice);
                    break;
                case "bacon":
                    this.price += baconPrice;
                    pizza.push(baconPrice);
                    break;
                case "Garlic":
                    this.price += garlicPrice;
                    pizza.push(garlicPrice);
                    break;
                case "garlic":
                    this.price += garlicPrice;
                    pizza.push(garlicPrice);
                    break;
                case "Corn":
                    this.price += cornPrice;
                    pizza.push(cornPrice);
                    break;
                case "corn":
                    this.price += cornPrice;
                    pizza.push(cornPrice);
                    break;
                case "Pepperoni":
                    this.price += pepperoniPrice;
                    pizza.push(pepperoniPrice);
                    break;
                case "pepperoni":
                    this.price += pepperoniPrice;
                    pizza.push(pepperoniPrice);
                    break;
                case "Olives":
                    this.price += olivesPrice;
                    pizza.push(olivesPrice);
                    break;
                case "olives":
                    this.price += olivesPrice;
                    pizza.push(olivesPrice);
                    break;
            }
        } else {
            System.out.println("pizza is already full");
        }
    }

    public void printCheck() {
        System.out.println("****************************************");
        System.out.println("Order: " + this.order);
        System.out.println("Client: " + this.CustomerNumber);
        System.out.println("Name: " + this.name);
        System.out.println("----------------------------------------");
        System.out.println("Pizza Base: " + this.pizzaType);
        for (int i = pizza.getIndex() + 1; i > 0; i--) {
            System.out.println(pizza.popIngredient() + ": " + pizza.popPrice() + " $");
        }
        System.out.println("----------------------------------------");
        System.out.println("Amount: " + price + " $");
        System.out.println("Quantity: " + quantity);
        System.out.println("----------------------------------------");
        System.out.println("Total amount: " + price * quantity + " $");
    }
}
