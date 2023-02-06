package homework_5.Lilit_Adamyan.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private List<String> ingredients;
    private String type;
    private int quantity;
    private final int maxIngredients = 7;

    public Pizza(String name, String pizzaType, int quantity, Customer customer) {
        if (name.length() >= 4 && name.length() <= 20) {
            this.name = name;
        } else {
            this.name = customer.getName() + "_" + customer.getId();
        }
        this.quantity= quantity;
        this.type = pizzaType;
        this.ingredients= new ArrayList<>();

    }
        public String getName() {
            return name;
        }

        public List<String> getIngredients() {
            return ingredients;
        }

        public String getType() {
            return type;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getMaxIngredients() {
            return maxIngredients;
        }

        public void addIngredients (String ingredient){
            if (ingredients.size() >= maxIngredients) {
                System.out.println("Pizza is already full");
                return;
            } else if (ingredients.contains(ingredient)) {
                System.out.println("Ingredient has already added .Please check the order again");
                return;
            }
            ingredients.add(ingredient);
        }



    }

