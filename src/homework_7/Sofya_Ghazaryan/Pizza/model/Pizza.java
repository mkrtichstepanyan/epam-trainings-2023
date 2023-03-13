package homework_7.Sofya_Ghazaryan.Pizza.model;

public class Pizza extends Product {


    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private Ingredient[] ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS];


    private int ingredientsCount = 0;

    public Pizza() {
    }


    public Pizza(String productName, ProductType productType, int quantity) {
        this.name = productName;
        this.productType = productType;
        this.quantity = quantity;
    }

    public Pizza(String productName, ProductType productType, Ingredient[] ingredients, int quantity) {
        this.name = productName;
        this.productType = productType;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    @Override
    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            if (ingredient != null) {
                ingredientPrice += ingredient.getPrice();
            }
        }
        return (this.getProductType().getPrice() + ingredientPrice);
    }


    public void addIngredient(Ingredient ingredient) {
        if (ingredientsCount >= MAX_ALLOWED_INGREDIENTS) {
            System.out.println("The pizza is full, you cannot add more then "
                    + MAX_ALLOWED_INGREDIENTS + " ingredients!!!");
            return;
        }
        for (int i = 0; i < ingredientsCount; i++) {
            Ingredient ingredient1 = ingredients[i];
            if (ingredient.getName().equalsIgnoreCase(ingredient1.getName())) {
                System.out.println("The ingredient already exists");
                return;
            }
        }
        ingredients[ingredientsCount++] = ingredient;
    }

    private String getValidPizzaName(String pizzaName, User user) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            validPizzaName = user.getUserName() + "_" + user.getUserNumber();
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
}

