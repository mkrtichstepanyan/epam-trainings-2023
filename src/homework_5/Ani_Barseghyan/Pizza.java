package homework_5.Ani_Barseghyan;

public class Pizza {
    private static final int MAX_ING_COUNT = 8;
    private String pizzaName;
    private char pizzaType;
    private int quantity;
    private int toppingCount;
    private Ingredients[] ingredients;
    private double crustCost = 0;

    Pizza() {
        this.ingredients = new Ingredients[MAX_ING_COUNT];
    }

    Pizza(String pizzaName, char pizzaType) {
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
        this.ingredients = new Ingredients[MAX_ING_COUNT];
    }

    Pizza(String pizzaName, char pizzaType, Ingredients[] ingredients) {
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
        if (ingredients.length > MAX_ING_COUNT) {
            System.out.println("Ingredients should not be more than 8");
            this.ingredients = new Ingredients[MAX_ING_COUNT];
        } else {
            this.ingredients = ingredients;
        }
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        if (pizzaName.length() < 4 || pizzaName.length() > 20) {
            this.pizzaName = "customer_name_";
        } else {
            this.pizzaName = pizzaName;
        }
    }

    public char getPizzaType() {
        return pizzaType;
    }


    public void setPizzaType(char pizzaType) {
        if (pizzaType == 'b' || pizzaType == 'B') {
            this.pizzaType = 'B';
        } else {
            this.pizzaType = 'C';
        }
    }

    public double getCrustCost() {
        if (pizzaType == 'b' || pizzaType == 'B') {
            crustCost = 1;
        } else {
            crustCost = 1.5;
        }
        return crustCost;
    }

    public int getToppingCount() {
        return toppingCount;
    }


    public void setToppingCount(int toppingCount) {
        this.toppingCount = toppingCount;
    }

    public int getQuantity() {
        return quantity;
    }

    public int setQuantity(int quantity) {
        if (quantity > 10) {
            System.out.println("You can order up to 10 pizzas");
        }
        this.quantity = quantity;
        return quantity;
    }

    public Ingredients[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients[] ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredients ingredient) {
        if (toppingCount > MAX_ING_COUNT) {
            System.out.println("Pizza is full");
        }
        ingredients[toppingCount++] = ingredient;
    }

    public double calculatePizzaCost() {
        double cost = getCrustCost();
        for (Ingredients i : ingredients) {
            if (i == null) {
                break;
            } else {
                cost += i.getToppingCost();
            }
        }
        return cost;
    }
}
