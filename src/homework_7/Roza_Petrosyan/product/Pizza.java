package homework_7.Roza_Petrosyan.product;

import homework_7.Roza_Petrosyan.HasIngredient;
import homework_7.Roza_Petrosyan.Ingredient;
import homework_7.Roza_Petrosyan.exceptions.product_exceptions.FullPizzaException;
import homework_7.Roza_Petrosyan.exceptions.product_exceptions.IngredientDuplicationException;
import homework_7.Roza_Petrosyan.productType.ProductType;

// is a
// has a
public class Pizza extends Product implements HasIngredient {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    private ProductType productType;
    public Ingredient[] ingredients;

    public Pizza(String name, ProductType productType, Ingredient[] ingredients, int quantity) {
        super(name, quantity);
        this.productType = productType;
        this.ingredients = ingredients;
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            if (ingredient != null) {
                ingredientPrice += ingredient.getPrice();
            }
        }
        return productType.getPrice() + ingredientPrice;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        // todo implement a method that will add ingredient into the list.
        try {
            checkIngredientDuplication(ingredient);
        } catch (IngredientDuplicationException | FullPizzaException e) {
            System.out.println(e.getMessage());
            return;
        }

        Ingredient[] newIngredients = new Ingredient[ingredients.length + 1];
        System.arraycopy(ingredients, 0, newIngredients, 0, ingredients.length);
        newIngredients[ingredients.length] = ingredient;
        this.ingredients = newIngredients;

    }

    private boolean isDuplicate(Ingredient addedIngredient) {
        boolean result = false;
        if (ingredients != null) {
            for (Ingredient ingredient : ingredients) {
                if (ingredient.getName().equals(addedIngredient.getName())) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    private void checkIngredientDuplication(Ingredient ingredient) {
        if (isDuplicate(ingredient)) {
            throw new IngredientDuplicationException();
        }
        if (ingredients.length >= MAX_ALLOWED_INGREDIENTS) {
            throw new FullPizzaException();
        }
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public ProductType getProductType() {
        return productType;
    }
}

