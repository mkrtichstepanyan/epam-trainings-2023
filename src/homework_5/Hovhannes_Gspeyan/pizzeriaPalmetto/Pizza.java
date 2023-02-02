package homework_5.Hovhannes_Gspeyan.pizzeriaPalmetto;

/**
 * This class built to implement
 * pizza objects for our pizzeria Palmetto
 */
public class Pizza {

    // declares max size of allowed ingredients in pizza object
    public static final int MAX_INGREDIENTS = 7;

    // declares pizzas obj. index
    // with customer_name if pizzas name
    // length isn't required
    private int index;
    // name of a pizza object
    private String name;

    //array of group for ingredients
    private String[] ingredients;

    // declares ingredients count for pizza object
    private int ingredientCount;

    // pizza type. rather it is calzone or not
    private String type;

    // declares quantity of pizza objects
    private final int quantity;

    // pizza object constructor with 3 args as parameters
    // also checks object's name is valid otherwise names
    // pizza obj. as "customer_name + quantity"
    public Pizza(String name, String type, int quantity,int index) {
        if (name.length() < 4 || name.length() > 20) {
            this.index = index;
            this.name = "customer_name_" + index;
        } else {
            this.name = name;
        }
        this.type = type;
        this.quantity = quantity;
        this.ingredients = new String[MAX_INGREDIENTS];
        this.ingredientCount = 0;
    }

    // adds ingredients to pizza, also disallows ingredient
    // count to rise more than max count of accessed and to
    // add already existing ingredient to pizza obj.
    public void addIngredient(String ingredient) {
        if (ingredientCount >= MAX_INGREDIENTS) {
            System.out.println("The pizza already has the maximum number of ingredients and cannot add more.");
            return;
        }
        for (int i = 0; i < ingredientCount; i++) {
            if (ingredients[i].equals(ingredient)) {
                System.out.println("The ingredient already exists, please check the order.");
                return;
            }
        }
        ingredients[ingredientCount++] = ingredient;
    }

    // getter for ingredients array, also
    // trims size of array to exclude
    // null pointer exception

    public String[] getIngredients() {
        int newLength = ingredientCount;
        String[] newIngredientArr = new String[newLength];
        System.arraycopy(ingredients, 0, newIngredientArr, 0, ingredientCount);
        ingredients = newIngredientArr;
        return ingredients;
    }

    // setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }
    public int getIndex() {
        return index;
    }
}
