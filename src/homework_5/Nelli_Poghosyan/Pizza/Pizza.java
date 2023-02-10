package homework_5.Nelli_Poghosyan.Pizza;

public class Pizza {
    private String pizzaName;
    private String pizzaType;
    private int quantity;

    private Ingredients[] ingredients;
    private int top = -1;

    public Pizza(String pizzaName, String pizzaType, int quantity, int size) {
        this.pizzaName = checkPizzaName(pizzaName);
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        ingredients = new Ingredients[size];
    }
    public Pizza(String pizzaName, String pizzaType, int quantity) {
        this.pizzaName = checkPizzaName(pizzaName);
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    public double getBasePrice(String pizzaType) {
        PizzaType p = new PizzaType();
        return p.getPizzaBasePrice(pizzaType);
    }

    public String checkPizzaName(String pizzaName) {
        if (pizzaName.length() >= 4 && pizzaName.length() <= 20) {
            return pizzaName;
        } else {
            return Order.getCustomerNumber() + "_" + Order.getOrderNumber();
        }
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addIngredient(Ingredients ingredient) {
        if (top == 7) {
            System.out.println("It is possible to use not more 7 different ingredients");
        } else {
                ingredients[++top] = checkIfExist(ingredient);
             }
        }
public Ingredients checkIfExist(Ingredients ingredient){
        for (int i = 0; i < top; i++){
           if(ingredient.getIngredientName().equals(ingredients[i].getIngredientName())){
                System.out.println("Please check the order of ingredients again.");
           }
        }
    return ingredient;
}

    public Ingredients getIngredient() {
        if (top < 0) {
            System.out.println("You haven't add any ingredient.");
            return null;
        } else {
            return ingredients[top--];
        }
    }

    public Ingredients[] getIngredients() {
        if (top < 0) {
            System.out.println("You haven't add any ingredients.");
            return null;
        } else {
            return ingredients;
        }
    }
}

