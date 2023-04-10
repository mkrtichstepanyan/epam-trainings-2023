package homework_7.TatevKocharyan;

public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private Ingredient[] ingredients;


    Pizza(String name, ProductType productType, int quantity) {
        super(name,productType,quantity);
    }


    Pizza( String name,ProductType productType, Ingredient[] ingredients, int quantity) {
        super(name,productType,quantity);

        this.ingredients =ingredients;

    }



    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.getProductType().getPrice() + ingredientPrice;
    }

    public void addIngredient(Ingredient ingredient) {
        for (int i = 0; i <ingredients.length ; i++) {
            ingredients[i]=ingredient;
        }
        if (ingredients.length==MAX_ALLOWED_INGREDIENTS){
            System.out.println("You can't add more than 7 ingredients");

        }
        // todo implement a method tht will add ingredient into the list. +
    }
}
