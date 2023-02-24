package homework_7.Karen_Sargsyan;

public class Barbecue extends Item {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private BarbecueMeatType barbecueMeatType;
    private IngredientBarbecue[] ingredients = new IngredientBarbecue[7];
    private int index = 0;

    Barbecue(BarbecueMeatType barbecueMeatType, IngredientBarbecue[] ingredients, int quantity) {
        super(Order.PRODUCT_BURGER, barbecueMeatType, quantity);
        this.barbecueMeatType = barbecueMeatType;
        addIngredient(ingredients);
    }

    public void addIngredient(IngredientBarbecue[] ingredients) {
        index = ingredients.length - 1;
        if (index < MAX_ALLOWED_INGREDIENTS) {
            for (int i = 0; i <= index; i++) {
                if (ingredients[index] != null) {
                    String tempIng = ingredients[i].getName();
                    for (int j = 0; j <= index; j++) {
                        if (ingredients[j].getName().equals(tempIng) && j != i) {
                            System.out.println(tempIng + " already exists in your burger!");
                            return;
                        }
                    }
                }
            }
            this.ingredients = ingredients;
        } else {
            System.out.println("The barbecue is already Full!");
        }
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (IngredientBarbecue ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.barbecueMeatType.getPrice() + ingredientPrice;
    }

    public IngredientBarbecue[] getIngredients() {
        return ingredients;
    }

    public BarbecueMeatType getBarbecueMeatType() {
        return barbecueMeatType;
    }

}
