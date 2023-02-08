package homework_5.TatevKocharyan.pizza_palmetto;

import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    static Pizza pizza = new Pizza();

    static PizzaStorage pizzaStorage = new PizzaStorage();

    public static void main(String[] args) {



        System.out.println("Please, make your order.What type of pizza do you want? regular/closed");
        String pizzaType = scanner.nextLine();
        if (pizzaType.equals("regular")) {
            pizza.setType("regular");
        }
        if (pizzaType.equals("closed")) {
            pizza.setType("closed");
        }


        System.out.println("we have severel types of pizzas, Please choose or make your own. " +
                        "If you want a pizza from a menu press 1 else press 2");
        int order=scanner.nextInt();
        if (order==1){
            System.out.println("We have 3 types of pizzas\n 1. Margarita \n 2.Pepperoni \n 3.Greek");
            System.out.println("Please Choose");
            int pizzaNumber=scanner.nextInt();
            if (pizzaNumber==1){
            pizza.setTomatoPaste("Tomato Paste");
            pizza.setPepper("Pepper");
            pizza.setGarlic("Garlic");
            pizza.setBacon("Becon");
            pizzaStorage.addOrder(pizza);
        }else if (pizzaNumber==2) {
                pizza.setTomatoPaste("Tomato Paste");
                pizza.setCheese("Cheese");
                pizza.setSalami("Salami");
                pizza.setOlives("Olives");
                pizzaStorage.addOrder(pizza);
            } else if (pizzaNumber==3) {
                pizza.setOlives("Olives");
                pizza.setCheese("Cheese");
                pizza.setGarlic("Garlic");
                pizza.setCorn("Corn");
                pizzaStorage.addOrder(pizza);
            }

        } else if (order==2) {
            System.out.println("tomatoPaste = 1$" +
                    "cheese = 1$\n" +
                    "salami = 1.5$\n" +
                    "Bacon = 1.2$\n" +
                    "Garlic = 0.3$\n" +
                    "Corn = 0.7$\n" +
                    "Pepperoni = 0.6$\n" +
                    "Olives = 0.5$ ");
            System.out.println("How many ingredients do you want");
            int countOfIngredients = scanner.nextInt();
            for (int i = 1; i <= countOfIngredients; i++) {
                System.out.println("Please write an ingredient");
                String ingredient = scanner.next();
                pizza.addIngredient(pizza, ingredient);
            }

        }else System.out.println("invalid command");


        System.out.println("How many pizzas do you want?. You can't order more than 10 ");
        int count=scanner.nextInt();
        if (count>10){
            System.out.println("You can't order more than 10");
        }else {
        pizza.setCount(count);}
        pizzaStorage.addOrder(pizza);
        pizzaStorage.print();
    }
}
