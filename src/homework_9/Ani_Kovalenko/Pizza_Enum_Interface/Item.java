package homework_9.Ani_Kovalenko.Pizza_Enum_Interface;

abstract class Item {
    private BasicType basicType;
    private BasicIngredient basicIngredient;
    private Pizza pizza;
    private Burger burger;
    private String product;
    private int quantity;
    private String name;

    public Item(String product, BasicType basicType, String name, int quantity) {
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

    public BasicType getItemType() {
        return basicType;
    }

    public BasicIngredient getIngredient() {
        return basicIngredient;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Burger getBurger() {
        return burger;
    }
}
