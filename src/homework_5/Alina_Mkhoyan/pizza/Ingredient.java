package homework_5.Alina_Mkhoyan.pizza;

public enum Ingredient {
    Tomato_paste("Tomato paste", 1.0F),
    Cheese("Cheese", 1.0F),
    Salami("Salami", 1.5F),
    Bacon("Bacon", 1.2F),
    Garlic("Garlic", 0.3F),
    Corn("Corn", 0.7F),
    Pepperoni("Pepperoni", 0.6F),
    Olives("Olives", 0.5F);

    Ingredient(String name, float price) {
        this.name = name;
        this.price = price;
    }

    private final String name;
    private final float price;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}