package homework_7.Radik_Manasyan.products;


import homework_7.Radik_Manasyan.products.productType.ProductType;

public class Pizza extends Products {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private Ingredient[] ingredients;

    public Pizza(String name, ProductType productType, Ingredient[] ingredients, int quantity) {
        super(name, productType, quantity);
        this.ingredients = ingredients;
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return getProductType().getPrice() + ingredientPrice;
    }

    public void addIngredient(Ingredient ingredient) {

        for (int i = ingredients.length; i < MAX_ALLOWED_INGREDIENTS; i++) {
            for (Ingredient ingredientPizza : ingredients) {
                if (ingredient.getName().equals(ingredientPizza.getName())) {
                    System.out.println(ingredient.getName() + " in ingredients list");
                    break;
                } else {
                    ingredients[i] = ingredient;
                }
            }

            if (ingredients.length == MAX_ALLOWED_INGREDIENTS) {
                System.out.println("All ingredients add in ingredient list");
            }
        }
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

}
