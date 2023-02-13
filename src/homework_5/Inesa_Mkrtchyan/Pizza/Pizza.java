package homework_5.Inesa_Mkrtchyan.Pizza;

import java.util.ArrayList;
import java.util.Objects;

public class Pizza {
    private String name;
    private ArrayList<Ingredient> ingredients;
    private String pizzaType;
    private int quantity;
    private double amount;
    private final int indexOfPizza;


    public Pizza() {
        ingredients = new ArrayList<>();
        indexOfPizza = Helper.rand.nextInt(1000,9999);
    }
    public String getName() {
        return name;
    }
    public void setName(String name,Customer customer) {
        if(name.length() <= 4 || name.length() >=20){
            this.name = customer.getName() + this.indexOfPizza;
            return;
        }
        this.name = name;
    }

    public int getIndexOfPizza() {
        return indexOfPizza;
    }
    public void addIngredient(Ingredient i){
        if(ingredients.size() == 7){
            System.out.println("Pizza is full");
            return;
        }
        for(Ingredient in : ingredients){
            if(in.getName().equals(i.getName())){
                System.out.println("You already have that ingridient");
                return;
            }
        }
        ingredients.add(i);
        this.amount += i.getAmount();
    }
    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        if(pizzaType.equals("Calzone")){
            this.pizzaType = "Calzone";
            this.amount += 1.5;
        }else{
            this.pizzaType = "Regular";
            this.amount += 1;
        }
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        amount *= quantity;
    }
    public double getAmount() {
        return amount;
    }


    public void printPizzaInfo(){
        System.out.println("----------------");
        if(pizzaType.equals("Calzone")){
            System.out.println("Pizza Base (" + this.pizzaType + ")  1.5 $");
        }else{
            System.out.println("Pizza Base (" + this.pizzaType + ")  1 $");
        }
        for(Ingredient i : ingredients){
            i.printIngredientInfo();
        }
        System.out.println("~~~~~~~~~");
        System.out.println("Amount : " + this.amount);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Name of Pizza : " + this.name);
        System.out.println("----------------");
    }
}
