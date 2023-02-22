package homework_7.Yeghia_Ansuryan.Palmetto;

public abstract class Product {
    private ProductType productType;
    private Ingredient ingredient;
    private Pizza pizza;
    private String product;
    private int quantity;
    private String name;

    public Product(String product, String name, int quantity) {
        this.product = product;
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

    public ProductType getProductType() {
        return productType;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public Pizza getPizza() {
        return pizza;
    }
}
