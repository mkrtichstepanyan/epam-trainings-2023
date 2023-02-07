package homework_5.Hovhannes_Gspeyan.pizzeriaPalmetto;

import java.util.ArrayList;
import java.util.List;

/**
 * This class built to implement
 * pizza objects for our pizzeria Palmetto
 */
public class Pizza {

    // declares max size of allowed ingredients in pizza object
    public static final int MAX_INGREDIENTS = 7;
    public static final int MAX_QUANTITY = 10;

    // declares pizzas obj. index
    // with customer_name if pizzas name
    // length isn't required
    private int index = 0;
    private static int indexNumber;

    // name of a pizza object
    private String name;

    //array of group for ingredients
    private List<String> ingredients;

    // pizza type. rather it is calzone or not
    private String type;

    // declares quantity of pizza objects
    private int quantity;


    // pizza object constructor with 3 args as parameters
    // also checks object's name is valid otherwise names
    // pizza obj. as "customer_name + quantity"
    public Pizza(String name, String type, int quantity, Customer customer) {
        if (quantity < MAX_QUANTITY) {
            if (name.length() < 4 || name.length() > 20) {
                this.index = indexNumber++;
                this.name = customer.getName() + "_" + index;
            } else {
                this.name = name;
            }
            this.type = type;
            this.quantity = quantity;
            this.ingredients = new ArrayList<>();
        } else{
            System.out.println("sorry, you can't order up to 10 pizzas! ");
            System.exit(1);
        }
    }

    // adds ingredients to pizza, also disallows ingredient
    // count to rise more than max count of accessed and to
    // add already existing ingredient to pizza obj.
    public void addIngredient(String ingredient) {
        if (this.ingredients.size() >= MAX_INGREDIENTS) {
            System.out.println("The pizza already has the maximum number of ingredients and cannot add more.");
        }
        if (this.ingredients.contains(ingredient)) {
            System.out.println("The ingredient already exists, please check the order.");
        } else {
            this.ingredients.add(ingredient);
        }
    }
    // setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getIndex() {
        return index;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
