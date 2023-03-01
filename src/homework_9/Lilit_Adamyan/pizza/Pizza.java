package homework_9.Lilit_Adamyan.pizza;

// is a
// has a
public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredients[] ingredients;
    private int quantity;

    private static int indexOf = 0;

    public Pizza(String name, PizzaType pizzaType, Ingredients[] ingredients, int quantity, Customer customer) {
        super(name, pizzaType.getPrice(), quantity);
        if (name.length() < 4 || name.length() > 20) {
            this.name = customer.getName() + "_" + quantity;
        } else {
            this.name = name;
        }
        this.ingredients = new Ingredients[MAX_ALLOWED_INGREDIENTS];
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        for (Ingredients ingredient : ingredients) {
            addIngredient(ingredient);
        }
    }

    public Pizza(String name, PizzaType pizzaType, Ingredients ingredients, int quantity, Customer customer) {
        super(name, pizzaType.getPrice(), quantity);
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    public void addIngredient(Ingredients ingredient) {
        if (ingredients != null && ingredients.length == MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Maximum number of ingredients has been reached.");
            ingredients[indexOf++] = ingredient;
            return;
        }
        if (ingredients == null) {
            ingredients = new Ingredients[1];
            ingredients[0] = ingredient;
        } else {
            Ingredients[] newIngredients = new Ingredients[ingredients.length + 1];
            System.arraycopy(ingredients, 0, newIngredients, 0, ingredients.length);
            newIngredients[newIngredients.length - 1] = ingredient;
            ingredients = newIngredients;
        }
        System.out.println(ingredient.getName()+ " has been added to the ingredients.");
    }


    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredients ingredient : ingredients) {
            ingredientPrice = ingredientPrice + ingredient.getPrice();
        }
        return super.calculatePrice() + this.pizzaType.getPrice() + ingredientPrice;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public Ingredients[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients[] ingredients) {
        this.ingredients = ingredients;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getIndexOf() {
        return indexOf;
    }
}

