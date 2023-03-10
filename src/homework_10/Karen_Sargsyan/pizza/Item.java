package homework_10.Karen_Sargsyan.pizza;

import homework_10.Karen_Sargsyan.pizza.productInterface.ProductComponent;

public abstract class Item {

    private ProductComponent productComponent;
    private ProductComponent basicIngredient;
    private Pizza pizza;
    private Barbecue barbecue;
    private String product;
    private int quantity;
    private String name;

    public Item(String product, ProductComponent productComponent, String name, int quantity) {
        this.product = product;
        this.productComponent = productComponent;
        this.name = name;
        this.quantity = quantity;
    }

    public Item(String product, ProductComponent productComponent, int quantity) {
        this.product = product;
        this.productComponent = productComponent;
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

    public ProductComponent getProductComponent() {
        return productComponent;
    }

    public ProductComponent getBasicIngredient() {
        return basicIngredient;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Barbecue getBarbecue() {
        return barbecue;
    }

}
