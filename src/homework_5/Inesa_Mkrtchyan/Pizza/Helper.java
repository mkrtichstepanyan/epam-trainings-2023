package homework_5.Inesa_Mkrtchyan.Pizza;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Helper {
    static Random rand = new Random();
    static Scanner inp = new Scanner(System.in);
    private static Ingredient[] CreateIngredients(){
       Ingredient[] ingredients = new Ingredient[8];
        ingredients[0] = new Ingredient("Tomato Paste",1);
        ingredients[1] = new Ingredient("Cheese", 1);
        ingredients[2] = new Ingredient("Salami", 1.5);
        ingredients[3] = new Ingredient("Bacon", 1.2);
        ingredients[4] = new Ingredient("Garlic", 0.3);
        ingredients[5] = new Ingredient("Corn", 0.7);
        ingredients[6] = new Ingredient("Pepperoni", 0.6);
        ingredients[7] = new Ingredient("Olives", 0.5);
        return ingredients;
    }
    private static Ingredient chooseIngredients(){
        Scanner inp = new Scanner(System.in);
        Ingredient[] all = CreateIngredients();
        for (int i = 0; i < all.length; i++) {
            System.out.print("N - " + i + "\t");
            all[i].printIngredientInfo();
        }
        System.out.println("press number 0-7  -  ");
        byte num = inp.nextByte();
        return all[num];
    }
    private static String chosePizzaType(){
        byte i = 0;
        System.out.print("you can choose one of two pizzas. Press 1 if you want Regular, 2 for Calzone  -  ");
        i = inp.nextByte();
        if (i == 2) {
            return "Calzone";
        }else{
            return "Regular";
        }
    }
    private static String CreatePizzaName(){
        String s;
        System.out.print("Please write name for pizza.(If pizza have not name press 0)  -  ");
        s = inp.next();
        if (s == "0") {
            return "";
        }else{
            return s;
        }
    }
    private static Customer CreateCustomer(){
        Customer customer = new Customer("");
        System.out.print("Please write customer name: ");
        String nameOfCustomer = inp.next();
        customer.setName(nameOfCustomer);
        return customer;

    }
    private static Pizza orderPizza(Customer customer){
        Pizza pizza = new Pizza();
        pizza.setName(CreatePizzaName(), customer);
        while(true){
            pizza.addIngredient(chooseIngredients());
            System.out.print("Do you want add ingredient? press y/n  -  ");
            char c = inp.next().charAt(0);
            if(c == 'n') break;
        }
        pizza.setPizzaType(chosePizzaType());
        System.out.print("How many pizzas do you want?  -   ");
        pizza.setQuantity(inp.nextInt());
        return pizza;
    }
    private static Order createOrder(){
        Order order = new Order();
        order.setCustomer(CreateCustomer());
        while(true){
            order.addPizza(orderPizza(order.getCustomer()));
            System.out.print("Do you want to order another pizza? press y/n  -  ");
            char c = inp.next().charAt(0);
            if(c == 'n') break;
        }
        return order;
    }
    static void Ordering(){
        Order order = createOrder();

        System.out.println("**********");
        System.out.println("Order - " + order.getOrderIndex());
        System.out.println("Client - " + order.getCustomer().getCustomerId());
        System.out.println("Name of Customer - " + order.getCustomer().getName());
        for(Pizza pizza : order.getPizzas()){
            pizza.printPizzaInfo();
        }
        System.out.println("Total Amount : " + order.getTotalAmount());
    }

}
