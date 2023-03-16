package homework_10.Anush_Ananyan.Pizza.Pizzeria;


import homework_10.Anush_Ananyan.Pizza.Exceptions.DuplicateException;
import homework_10.Anush_Ananyan.Pizza.Exceptions.PizzaFullException;

public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private int maxLength;


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
    public void addIngredients(Ingredient [] ingredients) {

        if (ingredients.length > MAX_ALLOWED_INGREDIENTS) {
            throw new PizzaFullException();
        }
        if (isDuplicate(ingredients)) {
            throw new DuplicateException();
        }
        this.ingredients= ingredients;
    }

    public boolean isDuplicate(Ingredient[] ingredients) {
        int countForLength = 0;
        boolean result = false;
        if (ingredients != null) {
            for (int i = 0; i < ingredients.length; i++) {
                int countForDuplicate = 1;
                if (ingredients[i] != null) {
                    for (int j = i + 1; j < ingredients.length; j++) {
                        if (ingredients[j] != null) {
                            if (ingredients[i].getName().equals(ingredients[j].getName())) {
                                result = true;
                                countForDuplicate++;
                                break;
                            }
                        }
                    }
                    if (countForDuplicate == 1) {
                        countForLength++;
                    }
                }
            }
        }
        maxLength = countForLength;
        return result;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

}

