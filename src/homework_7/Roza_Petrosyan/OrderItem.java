package homework_7.Roza_Petrosyan;

public abstract class OrderItem {
    private String name;
    private int quantity;
    public PizzaType pizzaType;
    public DrinkType drinkType;
    public Ingredient[] ingredients;

    OrderItem(String name, PizzaType pizzaType,Ingredient[] ingredients,int quantity){
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    OrderItem(String name, DrinkType drinkType,int quantity){
        this.name = name;
        this.drinkType = drinkType;
        this.quantity = quantity;
    }

    public abstract double calculatePrice();

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }
}
