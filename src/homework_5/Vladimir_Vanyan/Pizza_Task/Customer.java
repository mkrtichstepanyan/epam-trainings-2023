package homework_5.Vladimir_Vanyan.Pizza_Task;

import java.util.Random;

public class Customer {
    private  String name;
    private int number;
    Random r = new Random();
    private int low = 10000;
    private int high = 99999;

    public Customer(String name) {
        this.name = name;
        this.number = r.nextInt(high - low) + low;
    }

    private int getCustomerNumber() {
        double num = Math.random() * 10000;
        return (int) num;
    }

    public String getName() {

        return name;
    }

    public int getNumber() {

        return number;
    }
}
