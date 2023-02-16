package homework_5.Anushik_Gevorgyan;

public class Pizza {
    private String pizzaName;
    private PizzaType type;
    private Ingredients[] ingredients;
    private int count;
    private int maxLength;

    public Pizza(String pizzaName, PizzaType type, int count) {
        this.pizzaName = pizzaName;
        this.type = type;
        this.count = count;

    }

    public boolean isDuplicate(Ingredients[] ingredients) {
        int countForLength = 0;
        boolean result = false;
        if (ingredients != null) {
            for (int i = 0; i < ingredients.length; i++) {
                int countForDuplicate = 1;
                if (ingredients[i] != null) {
                    for (int j = i + 1; j < ingredients.length; j++) {
                        if (ingredients[j] != null) {
                            if (ingredients[i].getIngredientName().equals(ingredients[j].getIngredientName())) {
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


    public void addIngredients(Ingredients[] ingredients) {

        if (isDuplicate(ingredients)) {
            System.out.println("Please check the order again");
        }
        if (maxLength > 7) {
            System.out.println("The pizza is already full");
        }
        this.ingredients = ingredients;
    }


    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public PizzaType getType() {
        return type;
    }

    public Ingredients[] getIngredients() {
        return ingredients;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMaxLength() {
        return maxLength;
    }
}




