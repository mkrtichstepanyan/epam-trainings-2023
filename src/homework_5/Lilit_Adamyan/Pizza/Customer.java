package homework_5.Lilit_Adamyan.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private static int customerNumber = 7717;
    private int id;
    private String name;

    public Customer(String name){
        this.id = customerNumber++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
