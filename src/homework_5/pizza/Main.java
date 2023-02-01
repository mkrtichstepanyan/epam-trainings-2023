package homework_5.pizza;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        PizzaType pizzaType = new PizzaType("Calzone", 1.5);
        Pizza pizza = new Pizza("", pizzaType);
        pizza.addIngredients(Ingredients.getTomatoPaste());
        pizza.addIngredients(Ingredients.getPepperoni());
        pizza.addIngredients(Ingredients.getGarlic());
        pizza.addIngredients(Ingredients.getBacon());
        pizza.setQuantity(2);

        String characters = "QWERTYUIOASDFGHJKLZXCVBNM";
        String randomString = "";
        int length = 5;
        Random rand = new Random();
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        for (int i = 0; i < text.length; i++) {
            randomString += text[i];
        }

        Customer customer = new Customer(randomString);
        Order order = new Order();
        OrderItem orderItem = new OrderItem();
        CheckPrinter checkPrinter = new CheckPrinter(pizzaType, pizza, order, customer,orderItem);
        pizza.name = setName(pizza, customer, order, orderItem);
        checkPrinter.printReceipt();
    }

    public static String setName(Pizza pizza, Customer customer, Order order,OrderItem orderItem) {
        if ((pizza.name.length() < 4 || pizza.name.length() > 20) && (pizza.name.isBlank())) {
            return customer.getName() + "_" + order.getOrderNumber();
        } else {
            return pizza.name;
        }
    }
}
