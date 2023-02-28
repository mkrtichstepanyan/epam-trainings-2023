package homework_7.Karen_Sargsyan;

public abstract class Item {
    private ItemType itemType;
    private Ingredient ingredient;
    private Pizza pizza;
    private Barbecue barbecue;
    private String product;
    private int quantity;
    private String name;

    public Item(String product, ItemType itemType, String name, int quantity) {
        this.product = product;
        this.itemType = itemType;
        this.name = name;
        this.quantity = quantity;
    }

    public Item(String product, ItemType itemType, int quantity) {
        this.product = product;
        this.itemType = itemType;
        this.quantity = quantity;
    }

    abstract double calculatePrice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
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

    public Barbecue getBarbecue() {
        return barbecue;
    }

}
