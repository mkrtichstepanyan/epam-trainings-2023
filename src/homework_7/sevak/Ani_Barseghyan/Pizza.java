package homework_7.sevak.Ani_Barseghyan;

public class Pizza {
    private static final int MAX_ALLOWED_INGREDIENTS = 8;
    private String name;
    private PizzaType pizzaType;
    private static Ingredients[] ingredients = new Ingredients[10];
    private int quantity;
    private static int toppingCount;

    Pizza(String name, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    Pizza(String name, PizzaType pizzaType, Ingredients[] ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        Pizza.ingredients = ingredients;
        this.quantity = quantity;
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredients ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public static Ingredients addIngredients(Ingredients ingredient) {
        if (toppingCount > MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Pizza is full");
            return ingredient;
        }
        //if (!isExistingIngredient(ingredient)) {
            ingredients[toppingCount++] = ingredient;
     //   }
        return ingredient;
    }

//    private static boolean isExistingIngredient(Ingredients ingredient) {
//        for (Ingredients ing : ingredients) {
//            if (ingredient != null && ing.getName().equals(ingredient.getName())) {
//                System.out.println("Ingredient " + ingredient.getName() + " already exists in Pizza");
//                return true;
//            }
//        }
//        return false;
//    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPizzaTypeName() {
        return pizzaType.getName();
    }

    public double getPizzaTypePrice() {
        return pizzaType.getPrice();
    }

    public Ingredients[] getIngredients() {
        if (ingredients == null) {
            System.out.println("You need at least one topping on the pizza");
            ingredients[toppingCount] = Ingredients.TOMATO;
        }
        return ingredients;
    }
}
