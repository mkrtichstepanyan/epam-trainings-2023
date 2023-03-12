package homework_7.Anush_Ananyan;


// is a
// has a
public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;


    private Ingredient[] ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS];


    Pizza(String name, ProductType productType, int quantity) {
        super(name, productType, quantity);
    }

    Pizza(String name, ProductType productType, Ingredient[] ingredients, int quantity) {
        super(name, productType, quantity);
        this.ingredients = ingredients;
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.getProductType().getPrice() + ingredientPrice;
    }

    // todo implement a method tht will add ingredient into the list.
    public void addIngredients(Ingredient ingredient) {

        if (ingredients.length > MAX_ALLOWED_INGREDIENTS) {
            System.out.println("The pizza is already full");
            return;
        }
        if (isDuplicate(ingredient)) {
            System.out.println("Please check the order again");
        }
    }

    private boolean isDuplicate(Ingredient ingredient) {
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredient.equals(ingredients[i])) {
                return false;
            } else {
                ingredients[i++] = ingredient;
            }
        }
        return true;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

}

