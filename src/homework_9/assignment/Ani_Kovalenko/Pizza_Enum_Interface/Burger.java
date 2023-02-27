package homework_9.assignment.Ani_Kovalenko.Pizza_Enum_Interface;

public class Burger extends Item implements AddIngredient{
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
            isDublicate(ingredients);
            this.ingredients = ingredients;
        } else {
            System.out.println("The burger is already Full !!");
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
