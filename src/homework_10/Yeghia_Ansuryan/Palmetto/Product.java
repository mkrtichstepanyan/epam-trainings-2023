package homework_10.Yeghia_Ansuryan.Palmetto;

public abstract class Product {
    private Basic basicType;
    private Basic basicIngredient;
    private Pizza pizza;
    private String product;
    private int quantity;
    private String name;

    public Product(String product, Basic basicType, String name, int quantity) {
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

    public Basic getBasicType() {
        return basicType;
    }

    public Basic getBasicIngredient() {
        return basicIngredient;
    }

    void setName(String name) {
        this.name = name;
    }

    public Pizza getPizza() {
        return pizza;
    }
}
