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
    private int maxCount;

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
        Ingredient[] newIngredients = new Ingredient[ingredients.length + 1];
        System.arraycopy(ingredients, 0, newIngredients, 0, ingredients.length);
        newIngredients[ingredients.length] = ingredient;
        this.ingredients = newIngredients;

        checkIngredientDuplication(ingredients);

    }

    private boolean isDuplicate(Ingredient[] ingredients) {
        boolean result = false;
        if (ingredients != null) {
            int countOfIngredients = 0;
            for (int i = 0; i < ingredients.length; i++) {
                if (ingredients[i] != null) {
                    int countOfDuplication = 1;
                    for (int j = i + 1; j < ingredients.length; j++) {
                        if (ingredients[j] != null) {
                            if (ingredients[i].getName().equals(ingredients[j].getName())) {
                                result = true;
                                countOfDuplication++;
                            }
                        }
                    }
                    if (countOfDuplication == 1) {
                        countOfIngredients++;
                    }
                }
            }
            maxCount = countOfIngredients;
        }
        return result;
    }

    private void checkIngredientDuplication(Ingredient[] ingredients) {
        try {
            if (isDuplicate(ingredients)) {
                throw new IngredientDuplicationException();
            }
            if (maxCount > MAX_ALLOWED_INGREDIENTS) {
                throw new FullPizzaException();
            }

        } catch (IngredientDuplicationException | FullPizzaException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public ProductType getProductType() {
        return productType;
    }
}

