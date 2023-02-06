package homework_5.Ofelya_Khachatryan.pizza;

public class Pizza {

    private String name;
    private Ingredient [] ingredients;
    private PizzaType pizzaType;
    private int quantity;

    public Pizza(String name, Ingredient[] ingredients, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.ingredients = ingredients;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
