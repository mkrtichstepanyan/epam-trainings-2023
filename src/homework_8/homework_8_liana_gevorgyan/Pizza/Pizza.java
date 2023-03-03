package homework_8.homework_8_liana_gevorgyan.Pizza;

// is a
// has a
public class Pizza extends Product {

    private static final int MAX_ALLOWED_INGREDIENTS = 7;


    private Ingredient[] ingredients = new Ingredient[10];
    private int currentIngredientIndex= 0;

    Pizza(String name, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.type = pizzaType;
        this.quantity = quantity;
    }

    Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.type = pizzaType;
        this.quantity = quantity;

        for (int i=1; i < ingredients.length; i++) {
            this.addIngredient(ingredients[i]);
        }
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (int i = 0; i< currentIngredientIndex; i++) {
            ingredientPrice += ingredients[i].getPrice();
        }
        return this.type.getPrice() + ingredientPrice;
    }

    @Override
    public void validateAndCorrectName(Order order) {
        if (!(name != null && name.length() > 4 && name.length() < 20)) {
            System.out.println("The name " + name + " is invalid for pizza and will be corrected");

            name = order.getCustomerName() + "_" + order.getProductsQty();
        }
    }

    @Override
    public String getPrintableString() {

        String description = "Pizza Base (" + type.name + ") " + getBasePrice() + "$";

        System.out.println();
        for (int j= 0 ; j< currentIngredientIndex; j++){
            Ingredient currentIngredient = ingredients[j];
            description += "\n" + currentIngredient.getName() + " " + currentIngredient.getPrice() + "$";
        }
        return description;
    }

    public void addIngredient(Ingredient ingredient) {
        if (currentIngredientIndex == ingredients.length) {
            System.out.println("Pizza is full");
            return;
        }

        for (int i = 0; i < currentIngredientIndex; i++) {
            if (ingredients[i] == ingredient) {
                System.out.println("Please, select another ingredient, this one already in use");
                return;
            }
        }
        ingredients[currentIngredientIndex] = ingredient;
        currentIngredientIndex++;

    }



    public double getBasePrice() {
        return type.getPrice();
    }

    public int getIngredineQty() {
        return currentIngredientIndex;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
}

