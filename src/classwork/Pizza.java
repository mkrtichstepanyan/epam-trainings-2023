package classwork;

public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;


    private ProductType productType;
    private Ingredient[] ingredients;

    Pizza(String name, ProductType productType, int quantity) {
        super(name, quantity);
        this.productType = productType;
    }

    Pizza(String name, ProductType productType, Ingredient[] ingredients, int quantity) {
        super(name, quantity);
        this.productType = productType;
        this.ingredients = ingredients;
    }

    public Pizza() {
        super("name", 1);
    }


    @Override
    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.productType.getPrice() + ingredientPrice;
    }

    public void addIngredient(Ingredient ingredient) {
        // todo implement a method tht will add ingredient into the list.
    }

}

