package homework_5.Nona_Asatryan.pizzeria_palmetto;

import java.util.Random;

public class Customer {
    private String name;
    private final int number;

    public Customer(String name) {
        this.name = name;
        this.number = new Random().nextInt(10000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }
}
