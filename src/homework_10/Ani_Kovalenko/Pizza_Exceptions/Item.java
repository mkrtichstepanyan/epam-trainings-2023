package homework_10.Ani_Kovalenko.Pizza_Exceptions;

abstract class Item {
    private Basic basicType;
    private Basic basicIngredient;
    private Pizza pizza;
    private Burger burger;
    private String product;
    private int quantity;
    private String name;

    public Item(String product, Basic basicType, String name, int quantity) {
        this.product = product;
        this.basicType = basicType;
        this.name = name;
        this.quantity = quantity;
    }

    abstract double calculatePrice();

    public String getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Basic getItemType() {
        return basicType;
    }

    public Basic getIngredient() {
        return basicIngredient;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Burger getBurger() {
        return burger;
    }
}
