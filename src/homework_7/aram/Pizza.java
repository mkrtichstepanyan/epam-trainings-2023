package homework_7.aram;

// is a
// has a
public class Pizza {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    private String name;
    private PizzaType pizzaType;
    private  Ingredient[] ingredients=new Ingredient[10];
    private int quantity;
    private  int ingredientIndex;

    Pizza(String name, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public  void addIngredient(Ingredient ingredient) {
        // todo implement a method tht will add ingredient into the list.
        if(ingredientIndex>MAX_ALLOWED_INGREDIENTS){
            System.out.println("The pizza is already full");
            return ;
        }
        ingredients[ingredientIndex++]=ingredient;

    }
    public Ingredient[] getIngredients(){
        return ingredients;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    public PizzaType getPizzaType(){
        return pizzaType;
    }
    public String getPizzaTypeName(){
        return pizzaType.getName();
    }
    public double getPizzaTypePrice(){
        return pizzaType.getPrice();
    }
}

