package homework_7.Ani_Kovalenko.Pizza_Abstract;

abstract class Item {
    private ItemType itemType;
    private Ingredient ingredient;
    private Pizza pizza;
    private Burger burger;
    private String product;
    private int quantity;
    private String name;

    public Item(String product, ItemType itemType, String name, int quantity) {
        this.product = product;
        this.itemType = itemType;
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

    public ItemType getItemType() {
        return itemType;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Burger getBurger() {
        return burger;
    }
}
