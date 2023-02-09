package homework_5.Vardan_Mkrtchyan.Pizza;
import java.util.*;
public class Pizza {
    private int index;

    private String pizzaName;
    private final String[] ingredients = new String[]
            { "Tomato paste", "Cheese", "Salami", "Bacon",
              "Garlic", "Corn", "Pepperoni", "Olives"
            };
    private final double[] ingredientCost = new double[]{
            1, 1, 1.5, 1.2,
            0.3, 0.7, 0.6, 0.5
    };
    private double[] saveIngredientCost;
    private String[] saveIngredients;
    private int total;
    private final int quantity;
    private final boolean calzone;
    public Pizza(String name, boolean calzone, int quantity) {
        checkPizzaName(name);
        this.quantity = quantity;
        this.calzone = calzone;
        saveIngredients = new String[8];
        saveIngredientCost = new double[8];
        index = 0;
    }
    private void checkPizzaName(String name){
        if(name.length() > 4 && name.length() < 20){
            pizzaName = name;
        }
        else{
            System.out.println("rename pizza: ");
            Scanner sc = new Scanner(System.in);
            String x = sc.next();
            checkPizzaName(x);
        }
    }
    public void addIngredient() {
        while (index < 8){
            Scanner sc = new Scanner(System.in);
            System.out.println("Write index of ingredient to add (0-7)");
            int indx = sc.nextInt();
            for(int i = 0; i < index; i++){
                if (saveIngredients[i].equals(ingredients[indx] + ": " + ingredientCost[indx] + " $")){
                    System.out.println("This ingredient is already exists try to write another index");
                    addIngredient();
                    return;
                }
            }
            saveIngredients[index] = ingredients[indx] + ": " + ingredientCost[indx] + " $";
            saveIngredientCost[index] = ingredientCost[indx];
            System.out.println("Add more? (true/false)");
            boolean tr = sc.nextBoolean();
            index++;
            if(!tr){
                break;
            }
        }
        if(index >= 8){
            System.out.println("Pizza is full");
        }
    }
    public void printIngredients(){
        for(int i = 0; i < 8; i++){
            System.out.println(ingredients[i] + " [" + i + "]");
        }
    }
    public String getPizzaName(){
        return pizzaName;
    }
    public String[] getIngredients(){
        return saveIngredients;
    }
    public double[] getSaveIngredientCost(){
         return saveIngredientCost;
    }
    public boolean getCallzone(){
        return calzone;
    }
    public int getQuantity() {
        return quantity;
    }

    public int getIndex() {
        return index;
    }


}
