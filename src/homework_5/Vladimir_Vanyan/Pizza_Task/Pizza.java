package homework_5.Vladimir_Vanyan.Pizza_Task;

import java.util.List;

public class Pizza {
    public String pizzaName;
    public String type;
    public List<String> ingredients;
    public double price;
    public  int quantity;
    public String costomerName;

    Pizza(String pizzaName, String type, List<String> ingredients,int quantity,String costomerName) {
        this.pizzaName = pizzaName;
        this.type = type;
        this.ingredients = ingredients;
        this.price = 1;
        this.quantity=quantity;
        this.costomerName=costomerName;
    }
}
