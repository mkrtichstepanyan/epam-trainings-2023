package homework_7.Araksya_Ghazaryan.pizza;

import homework_7.Araksya_Ghazaryan.product.Product;
import homework_7.Araksya_Ghazaryan.product.ProductType;


public class Pizza extends Product {
    public static final Pizza MARGARITA = new Pizza("Margarita", PizzaType.CALZONE, new Ingredient[]{Ingredient.CORN, Ingredient.BACON}, 3);
    public static final Pizza PEPPERONI = new Pizza("Pepperoni", PizzaType.REGULAR, new Ingredient[]{Ingredient.PEPPERONI, Ingredient.CHEESE}, 1);
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    public ProductType getProductType() {
        return productType;
    }

    private ProductType productType;
    private Ingredient[] ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS];
    private int ingredientsCount = 0;


    public Pizza(String name, ProductType productType, int quantity) {
        this.name = name;
        this.productType = productType;
        this.quantity = quantity;

    }
    public Pizza(String name, ProductType productType, Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.productType = productType;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }
    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            if (ingredient != null) {
                ingredientPrice += ingredient.getPrice();
            }
        }
        return (this.productType.getPrice() + ingredientPrice) * quantity;
    }
    public void addIngredient(Ingredient ingredient) {
        if (ingredientsCount >= MAX_ALLOWED_INGREDIENTS) {
            System.out.println("The pizza is already full");
            return;
        }
        for (int i = 0; i < ingredientsCount; i++) {
            Ingredient ingredient1 = ingredients[i];
            if (ingredient.getName().equals(ingredient1.getName())) {
                System.out.println("The pizza already contains this ingredient");
                return;
            }
        }
        ingredients[ingredientsCount++] = ingredient;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
}