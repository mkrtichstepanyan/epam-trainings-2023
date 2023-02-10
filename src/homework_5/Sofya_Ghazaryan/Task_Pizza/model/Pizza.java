package homework_5.Sofya_Ghazaryan.Task_Pizza.model;


import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private List<String> ingredientsList = new ArrayList<>();

    private Type type;
    private int quantity;
    private Customer customer;

    public Pizza() {
    }


    public Pizza(String name, Type type, int quantity, Customer customer) {
        if (quantity <= 10) {
            if (name.length() >= 4 && name.length() <= 20) {
                this.name = name;
            } else {
                this.name = customer.getName() + "_" + customer.getCustomerNumber();
            }
            this.type = type;
            this.quantity = quantity;
            this.customer = customer;
        } else {
            System.out.println("You cant order more than 10 pizzas");
            System.exit(1);
        }

    }

    public Pizza(String name, List<String> ingredients, Type type, int quantity, Customer customer) {
        this.name = name;
        this.ingredientsList = ingredients;
        this.type = type;
        this.quantity = quantity;
        this.customer = customer;
    }

    public void addIngredient(String ingredient) {
        if (ingredientsList.size() >= 7) {
            System.out.println("The Pizza is full, you cannot add more ingredients.");
        } else if (ingredientsList.contains(ingredient)) {
            System.out.println("The Ingredient exists, Please choose another Ingredient!!!");
        } else {
            ingredientsList.add(ingredient);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredientsList;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredientsList = ingredients;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredientsList=" + ingredientsList +
                ", type=" + type +
                ", quantity=" + quantity +
                ", customer=" + customer +
                '}';
    }
}
