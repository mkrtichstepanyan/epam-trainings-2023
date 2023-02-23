package homework_7.Ani_Barseghyan;

public class Pizza extends Product implements AddIngredient {
    private static final int MAX_ALLOWED_INGREDIENTS = 8;
    private static Ingredients[] ingredients;
    private static int toppingCount;


    Pizza(String name, ProductType productType, int quantity) {
        super(name, productType, quantity);
        ingredients = new Ingredients[MAX_ALLOWED_INGREDIENTS];
    }

    Pizza(String name, ProductType productType, Ingredients[] ingredients, int quantity) {
        super(name, productType, quantity);
        Pizza.ingredients = ingredients;

    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredients ingredient : ingredients) {
            if (ingredient != null) {
                ingredientPrice += ingredient.getPrice();
            }
        }
        return super.getProductType().getPrice() + ingredientPrice;
    }

    @Override
    public void addIngredients(Ingredients ingredient) {
        if (toppingCount > MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Pizza is full");
        }
        if (!isExistingIngredient(ingredient)) {
            ingredients[toppingCount++] = ingredient;
        }
    }

    private boolean isExistingIngredient(Ingredients ingredient) {
        for (Ingredients ing : ingredients) {
            if (ingredient != null && ingredient.equals(ing)) {
                System.out.println("Ingredient " + ingredient.getName() + " already exists in Pizza");
                return true;
            }
        }
        return false;
    }


    public static Ingredients[] getIngredients() {
        if (ingredients == null) {
            System.out.println("You need at least one topping on the pizza");
            ingredients[toppingCount] = Ingredients.TOMATO;
        }
        return ingredients;
    }

    public ProductType getProductType() {
        return super.getProductType();
    }
}
