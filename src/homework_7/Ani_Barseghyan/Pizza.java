package homework_7.Ani_Barseghyan;

import homework_7.Ani_Barseghyan.exceptions.DuplicateIngredientException;
import homework_7.Ani_Barseghyan.exceptions.ProductQuantityException;

public class Pizza extends Product implements Ingredient {
    private static final int MAX_ALLOWED_INGREDIENTS = 8;
    private static final int MAX_AMOUNT = 10;
    private static Ingredients[] ingredients;
    private static int toppingCount;


    Pizza(String name, ProductType productType, int quantity) {
        super(name, productType, quantity);
        try {
            if (quantity > MAX_AMOUNT) {
                this.setQuantity(MAX_AMOUNT);
                throw new ProductQuantityException();
            }
        } catch (ProductQuantityException q) {
            System.out.println(q.getMessage());
        }
        ingredients = new Ingredients[MAX_ALLOWED_INGREDIENTS];
    }

    Pizza(String name, ProductType productType, Ingredients[] ingredients, int quantity) {
        super(name, productType, quantity);
        try {
            if (quantity > MAX_AMOUNT) {
                this.setQuantity(MAX_AMOUNT);
                throw new ProductQuantityException();
            }
        } catch (ProductQuantityException q) {
            System.out.println(q.getMessage());
        }
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
    public void addIngredient(Ingredients ingredient) throws DuplicateIngredientException {
        if (toppingCount > MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Pizza is full");
        }
        if (!isExistingIngredient(ingredient)) {
            ingredients[toppingCount++] = ingredient;
        }
    }

    private boolean isExistingIngredient(Ingredients ingredient) throws DuplicateIngredientException {
        for (Ingredients ing : ingredients) {
            if (ingredient != null && ingredient.equals(ing)) {
                throw new DuplicateIngredientException(ingredient);
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
