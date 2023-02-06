package Homework5.Inesa_Mkrtchyan.Pizzeria;

import java.util.ArrayList;
import java.util.Random;

public class Order {
    public ArrayList<Pizza> pizzas;
    public Customer customer;
    public double quantity;
    public final int number;
    public Order(){
        customer = new Customer("Customer");
        pizzas = new ArrayList<Pizza>();
        Random rand = new Random();
        this.number = rand.nextInt(10000,99999);
    }
    public void orderPizza(Pizza pizza){
        if(pizza.pizzaName.length() <= 4 || pizza.pizzaName.length() >= 20){
            pizza.pizzaName = customer.name + pizza.number;
        }

        this.pizzas.add(pizza);
        this.quantity = 0;
        for(Pizza i : pizzas){
            quantity += i.quantity;
        }
    }

    public void PrintOrderInfo(){
        System.out.println("Order - " + this.number);
        System.out.println("Client - " + this.customer.number);
        for(Pizza p : pizzas){
            p.printPizzaInfo();
        }
        System.out.println("---------------------------------------");
        System.out.println("Total amount - " + quantity);
    }

}
