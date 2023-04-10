package homework_6.Hayk_Davtyan.Pizza;

import java.util.Scanner;

public class PizzaService {
    public Pizza createPizza(){
        Scanner s = new Scanner(System.in);
        Pizza pizza = new Pizza();
        System.out.println("Enter five numbers: ");
        pizza.setOrder(s.nextInt());
        System.out.println("Enter four numbers: ");
        pizza.setCustomer(s.nextInt());
        System.out.println("Enter your name: ");
        pizza.setName(s.next());
        System.out.println("How many pizzas do you want?");
        pizza.setQuantity(s.nextInt());
        return pizza;
    }

}
