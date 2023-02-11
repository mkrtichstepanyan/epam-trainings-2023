package homework_5.Yeghia_Ansuryan.Palmetto;

public class Pizza {
    private String name;
    private int index;
    private Ingredient[] ingredients;
    private String pizzaType;
    private int quantity;

    public Pizza(String name, String pizzaType, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public Pizza(String name, int index) {
        this.index = index;
        if (name.length() >= 4 && name.length() <= 20) {
            this.name = name;
        } else {
            this.name = "customer_" + index;
        }

    }
}
