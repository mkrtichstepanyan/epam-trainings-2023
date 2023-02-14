package homework_5.Vardan_Mkrtchyan.Pizza;
import java.util.*;
public class Order {
    private  int index;
    private static int orderNumber = 6745;
    private final Customer customer;
    ArrayList<Pizza> objList = new ArrayList<Pizza>();
    Order(Customer customer){
        this.customer = customer;
    }
    public void addPizza(Pizza pizza) {
        orderNumber++;
        objList.add(pizza);
    }
    public void printCheck(){
        System.out.println("*****************");
        double total = 0;
        for(Pizza x : objList){
            System.out.println("Order: " + orderNumber);
            System.out.println("Client: " + customer.getClientNumber());
            System.out.println("Name: " + x.getPizzaName());
            System.out.println("______________");
            if(x.getCallzone()){
                System.out.println("Pizza Base (Calzone): 1.50 $");
            }
            else {
                System.out.println("Pizza Base (Regular): 1.00 $");
            }
            for(int i = 0; i < x.getIndex(); i++){
                String newArr[] = x.getIngredients();
                System.out.println(newArr[i]);
            }
            total = (calculate(x) + total) * x.getQuantity();
            System.out.println("____________________");
            System.out.println("Amount: " +  calculate(x) + " $");
            System.out.println("Quantity: " + x.getQuantity());
            System.out.println("___________________");
        }

        System.out.println("Total amount: " + total);
    }
    private double calculate(Pizza x){
        double newArr[] = x.getSaveIngredientCost();
        double cost;
        if(x.getCallzone()) cost = 1.5;
        else cost = 1.0;

        for(int i = 0; i < x.getIndex(); i++){
            cost = newArr[i] + cost;
        }
        return cost;
    }
}
