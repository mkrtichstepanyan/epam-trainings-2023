package homework_5.Gevorg_Martirosian.pizzaHomework;

public class Pizza {
    private String name;
    private String[] ingredients;
    private String type;
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Pizza(String name, String type, int count) {
        this.name = name;
        this.ingredients = new String[8];
        this.type = type;
        this.count = count;
        if (name.toLowerCase().equals("margarita")) {
            addIngredients("tomato paste", "pepperoni", "garlic", "bacon");
        } else if (name.toLowerCase().equals("pepperonioro")) {
            addIngredients("tomato paste", "pepperoni", "cheese", "olives");
        }
    }

    public void addIngredients(String... ingredients) {
        point:
        for (String el : ingredients) {
            for (int i = 0; i < this.ingredients.length; i++) {
                if (this.ingredients[i] != null && this.ingredients[i].equals(el)) {
                    System.out.println("The ingredient " + el +  " already exists. Please check your order.");
                    continue point;
                }
                if (this.ingredients[i] == null) {
                    this.ingredients[i] = el;
                    continue point;
                }
            }
        }
    }
}
