package homework_9.Karen_Sargsyan.pizza;

public abstract class Item {

    private Basic basicType;
    private Basic basicIngredient;
    private Pizza pizza;
    private Barbecue barbecue;
    private String product;
    private int quantity;
    private String name;

    public Item(String product, Basic basicType, String name, int quantity) {
        this.product = product;
        this.basicType = basicType;
        this.name = name;
        this.quantity = quantity;
    }

    public Item(String product, Basic basicType, int quantity) {
        this.product = product;
        this.basicType = basicType;
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

    public Basic getBasicType() {
        return basicType;
    }

    public Basic getBasicIngredient() {
        return basicIngredient;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Barbecue getBarbecue() {
        return barbecue;
    }

}
