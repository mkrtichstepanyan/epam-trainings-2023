package homework_5.Inesa_Mkrtchyan.Pizzeria;

import java.util.ArrayList;
import java.util.Random;

public class Pizza {
    public String pizzaName;
    public ArrayList<Ingredient> ingridients;
    public PizzaType pizzaType;
    public double quantity;
    public final int number;
    public Pizza(){
        Random rand = new Random();
        this.number = rand.nextInt(10000,99999);
        ingridients = new ArrayList<Ingredient>();
    }


    public void addPizzaType(PizzaType p){
        this.pizzaType = p;
        quantity += p.quantity;

    }
    public void addIngredient(Ingredient i){
        if(ingridients.size() == 7){
            System.out.println("Pizza is full");
            return;
        }
        for(Ingredient in : ingridients){
            if(in.name.equals(i.name)){
                System.out.println("You already have that ingridient");
                return;
            }
        }
        ingridients.add(i);
        quantity += i.quantity;
    }
    public void printPizzaInfo(){
        System.out.println("!!!!!!!!!!!!!!!!!");
        System.out.println("Pizza Name: " + pizzaName);
        System.out.println("Pizza Base : " + pizzaType.name + " - " + pizzaType.quantity);
        for(Ingredient i : ingridients){
            i.printIngredient();
        }
        System.out.println("Price is : " + quantity);
        System.out.println("!!!!!!!!!!!!!!!!!");
    }
}