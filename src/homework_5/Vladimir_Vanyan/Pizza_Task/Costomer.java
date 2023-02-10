package homework_5.Vladimir_Vanyan.Pizza_Task;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Costomer {

    public  int costomerNumber;
    public String costomerName;
    public String pizzaName;
    public String pizzaType;
    int quantity;

    Costomer(String costomerName,String pizzaName,String pizzaType,int quantity) {
        this.costomerName = costomerName;
        this.pizzaName=pizzaName;
        this.pizzaType=pizzaType;
        this.quantity=quantity;
    }
    Pizza orderInfo() {
        Scanner scanner = new Scanner(System.in);
        List<String> ingredients = new ArrayList<String>(7);
        String ingredient;

        char choice;
        while (true) {
            System.out.println("Choose ingredients");
            ingredient = scanner.next();
            ingredients.add(ingredient);
            System.out.println("If you want to choose more enter Y");
            choice = scanner.next().charAt(0);
            if (ingredients.size() == 7) {
                System.out.println("You can't choose more than 7 ingredients");
                break;
            }
            if (choice == 'Y' || choice == 'y') {
               continue;
            }
            else {
                break;
            }
        }
        Pizza pizza = new Pizza(pizzaName, pizzaType, ingredients,quantity,costomerName);
        return pizza;
    }
}
