package homework_7.Nelli_Poghosyan;

// is a
// has a
public class Pizza extends Product {
        private static final int MAX_ALLOWED_INGREDIENTS = 7;
        private PizzaType pizzaType;
        private Ingredient[] ingredients;
        private int index;

        Pizza(String name, PizzaType pizzaType, int quantity) {
            super(name, pizzaType, quantity);
        }

        Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
            super(name, pizzaType, quantity);
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
            int ingredientIndex = index++;
            if (MAX_ALLOWED_INGREDIENTS == 7) {
                System.out.println("It is possible to use not more 7 different ingredients");
                return;
            }
            ingredients[ingredientIndex] = checkIfExist(ingredient);
        }

        public Ingredient getIngredient() {
            if (index < 0) {
                System.out.println("You haven't add any ingredient.");
                return null;
            } else {
                return ingredients[index--];
            }
        }

        public Ingredient checkIfExist(Ingredient ingredient) {
            for (int i = 0; i < MAX_ALLOWED_INGREDIENTS; i++) {
                if (ingredient.getName().equals(ingredients[i].getName())) {
                    System.out.println("Please check the order of ingredients again.");
                }
            }
            return ingredient;
        }

        public PizzaType getPizzaType() {
            return pizzaType;
        }

        public Ingredient[] getIngredients() {
            return ingredients;
        }

        public int getIndex() {
            return index;
        }
    }


