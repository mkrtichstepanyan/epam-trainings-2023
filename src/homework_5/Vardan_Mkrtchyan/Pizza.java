package homework_5.Vardan_Mkrtchyan;

import java.util.Scanner;
public class Pizza {
    public static void main(String[] args) {

        OrderPizza pizza = new OrderPizza("Ashot");
        pizza.pizzaMake("Lopopidze", 3, true);
        for(int i = 0; i < 5; i++){
            pizza.addIntegrient(i);
        }
        pizza.printCheck();

        OrderPizza pizza1 = new OrderPizza();
        pizza1.pizzaMake("adf", 1, false);
        for(int i = 3; i < 8; i++){
            pizza1.addIntegrient(i);
        }
        pizza1.printCheck();
    }
}
class OrderPizza{
    private
    static int order = 7777, client = 6586;
    int quantity, intregientCount = 0;
    double totalCost;
    boolean callzone;
    String personName, pizzaName;
    String[] intregients = new String[]{
            "Tomato paste", "Cheese", "Salami", "Bacon",
            "Garlic", "Corn", "Pepperoni", "Olives"
    };
    double[] intregientCost = new double[]{
            1, 1, 1.5, 1.2,
            0.3, 0.7, 0.6, 0.5
    };
    String[] intregientOrder = new String[8];
    double[] intregientOrderCost = new double[8];
    public
    OrderPizza(){
        client++;
    }
    OrderPizza(String name){
        personName = name;
        client++;
    }

    void pizzaMake(String pzName, int quantt, boolean callzone){
        if(pzName.length() < 4 || pzName.length() > 20){
            Scanner sc = new Scanner(System.in);
            System.out.println("rename pizza: ");
            String x = sc.next();
            pizzaMake(x, quantt, callzone);
            return;
        }
        if(callzone){
            this.callzone = true;
            totalCost = 1.5;
        }
        else{
            totalCost = 1;
        }
        pizzaName = pzName;
        quantity = quantt;
        intregientCount = 0;
        intregientOrder = new String[8];
        intregientOrderCost = new double[8];
        order++;
    }
    void addIntegrient(int x){
        if(intregientCount < 8){
            intregientOrder[intregientCount] = intregients[x];
            intregientOrderCost[intregientCount] = intregientCost[x];
            intregientCount++;
            totalCost = totalCost + intregientCost[x];
        }
        else {
            System.out.println("Pizza is full");
        }
    }
    void printCheck(){
        System.out.println("*******************************");
        System.out.println("Order: " + order);
        System.out.println("Client: " + client);
        System.out.println("Name: " + personName);
        System.out.println("Pizza Name: " + pizzaName);
        System.out.println("_______________________________");
        if(callzone) System.out.println("Pizza base: 1.5");
        else System.out.println("Pizza base: 1");
        for(int i = 0; i < intregientCount; i++){
            System.out.println(intregientOrder[i] + " " + intregientOrderCost[i] + " $");
        }
        System.out.println("_______________________________");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total amount: " + quantity * totalCost);
    }
}
