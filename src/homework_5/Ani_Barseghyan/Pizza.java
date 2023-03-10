package homework_5.Ani_Barseghyan;

public class Pizza {
    private static final int MAX_ING_COUNT = 8;
    private String pizzaName;
    private char pizzaType;
    private int quantity;
    private int toppingCount;
    private Ingredients[] ingredients;

    Pizza() {
        this.pizzaName = getPizzaName();
        this.pizzaType = getPizzaType();
        this.ingredients = new Ingredients[MAX_ING_COUNT];
    }

    Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
        this.pizzaType = getPizzaType();
        this.ingredients = new Ingredients[MAX_ING_COUNT];
    }

    Pizza(String pizzaName, char pizzaType) {
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
        this.ingredients = new Ingredients[MAX_ING_COUNT];
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName, int orderNumber) {
        if (pizzaName == null || pizzaName.length() < 4 || pizzaName.length() > 20) {
            this.pizzaName = "customer_name_" + orderNumber;
        } else {
            this.pizzaName = pizzaName;
        }
    }

    public char getPizzaType() {
        return pizzaType;
    }


    public void setPizzaType(char pizzaType) {
        if (pizzaType == 0 || pizzaType == 'b' || pizzaType == 'B') {
            this.pizzaType = 'B';
        } else {
            this.pizzaType = 'C';
        }
    }

    public double getCrustCost() {
        double crustCost = 0;
        if (pizzaType == 'b' || pizzaType == 'B') {
            crustCost = 1;
        } else {
            crustCost = 1.5;
        }
        return crustCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 10) {
            System.out.println("You can order up to 10 pizzas");
            this.quantity = 10;
        } else if (quantity == 0) {
            System.out.println("You need to order at least 1 pizza");
            this.quantity = 1;
        } else {
            this.quantity = quantity;
        }
    }

    public Ingredients[] getIngredients() {
        if (ingredients == null) {
            System.out.println("You need at least one topping on the pizza");
            ingredients[toppingCount] = Ingredients.addTomatoPaste();
        }
        return ingredients;
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
