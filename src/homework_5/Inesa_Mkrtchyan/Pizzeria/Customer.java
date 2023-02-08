package homework_5.Inesa_Mkrtchyan.Pizzeria;
import java.util.Random;

public class Customer {
    public String name;
    public final int number;

    public Customer(String name){
        this.name = name;
        Random rand = new Random();
        this.number = rand.nextInt(1000,9999);
    }
    public void PrintCustomerInfo(){
        System.out.println("Customer Name - " + name + "   Customer number - " + number);
    }
}
