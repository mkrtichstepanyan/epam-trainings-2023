package homework_7.Roza_Petrosyan.product;

import homework_7.Roza_Petrosyan.HasIngredient;
import homework_7.Roza_Petrosyan.Ingredient;
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
        int newSize = 0;
        if (getIngredients() != null) {
            newSize = getIngredients().length;
        }
        Ingredient[] newIngredients = new Ingredient[++newSize];
        if (getIngredients().length == 0) {
            for (int i = 0; i < newIngredients.length; i++) {
                newIngredients[newIngredients.length - 1] = ingredient;
            }
        } else {
            for (int i = 0; i < getIngredients().length; i++) {
                newIngredients[i] = getIngredients()[i];
                newIngredients[newIngredients.length - 1] = ingredient;
            }
        }


        this.ingredients = newIngredients;

        if (isDuplicate(ingredients)) {
            System.out.println("Please check your order again!");
            return;
        }

        if (maxCount > MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Pizza is full!");
        }
    }

    public boolean isDuplicate(Ingredient[] ingredients) {
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

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public ProductType getProductType() {
        return productType;
    }
}

