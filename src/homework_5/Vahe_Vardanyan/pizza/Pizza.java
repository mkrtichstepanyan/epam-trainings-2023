package homework_5.Vahe_Vardanyan.pizza;


import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private static int Max_Quantity_of_pizzas = 10;
    String name;
    List<String> ingredients;
    PizzaType type;
    int quantity;

    public Pizza(String name, PizzaType type, int quantity, Costomer costomer){
        if (quantity < Max_Quantity_of_pizzas) {
            if (name.length() < 4 || name.length() > 20){
                this.name = costomer.getName() + " " + costomer.getNumber();
            }else {
                this.name = name;
            }
            this.type = type;
            this.quantity = quantity;
            this.ingredients = new ArrayList<>();
        }else {
            System.out.println("You can not order more than 10 pizzas");
            System.exit(1);
        }
    }

    public void addIngredient(String ingredient){
        if (this.ingredients.size() >= 7){
            System.out.println("The pizza is already full");
        }else
             if (this.ingredients.contains(ingredient)){
                System.out.println("The ingredient id already added. Pleace check the order again");
            }else {
                this.ingredients.add(ingredient);
            }
    }
    public String getName(){
        return this.name;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public List<String> getIngredients(){
        return this.ingredients;
    }
    public PizzaType getType(){
        return this.type;
    }

}
