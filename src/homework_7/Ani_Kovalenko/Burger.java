package homework_7.Ani_Kovalenko;

public class Burger extends Item {
    public static final int MAX_ALLOWED_INGREDIENTS = 7;
    private BurgerBreadType breadType;
    private IngredientBurger[] ingredients = new IngredientBurger[7];
    private int index = 0;

    Burger(String name, BurgerBreadType breadType, IngredientBurger[] ingredients, int quantity) {
        super(Order.PRODUCT_BURGER,breadType, name, quantity);
        this.breadType = breadType;
        addIngredients(ingredients);
    }

    void addIngredients(IngredientBurger[] ingredients) {
        index = ingredients.length - 1;
        if (index < MAX_ALLOWED_INGREDIENTS) {
            for (int i = 0; i <= index; i++) {
                if (ingredients[index] != null) {
                    String tempIngr = ingredients[i].getName();
                    for (int j = 0; j <= index; j++) {
                        if (ingredients[j].getName().equals(tempIngr) && j != i) {
                            System.out.println(tempIngr + " already exists in your burger !!");
                            return;
                        }
                    }
                }
            }
            this.ingredients = ingredients;
        } else {
            System.out.println("The pizza is already Full !!");
        }
    }

    @Override
    double calculatePrice() {
        double ingredientPrice = 0.0;
        for (IngredientBurger ingredient : ingredients) {
            if (ingredient != null) {
                ingredientPrice += ingredient.getPrice();
            }
        }
        return this.getBreadType().getPrice() + ingredientPrice;
    }

    public IngredientBurger[] getIngredients() {
        return ingredients;
    }

    public BurgerBreadType getBreadType() {
        return breadType;
    }
}
