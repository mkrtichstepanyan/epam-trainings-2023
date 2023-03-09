package homework_10.Yeghia_Ansuryan.Palmetto.myAbstract;

import homework_10.Yeghia_Ansuryan.Palmetto.diffrentClasses.Pizza;
import homework_10.Yeghia_Ansuryan.Palmetto.myInterface.ProductComponent;

public abstract class Product {
    private ProductComponent basicType;
    private ProductComponent basicIngredient;
    private Pizza pizza;
    private String product;
    private int quantity;
    private String name;

    public Product(String product, ProductComponent basicType, String name, int quantity) {
        this.product = product;
        this.basicType = basicType;
        this.name = name;
        this.quantity = quantity;
    }

    public abstract double calculatePrice();

    public String getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductComponent getBasicType() {
        return basicType;
    }

    public ProductComponent getBasicIngredient() {
        return basicIngredient;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pizza getPizza() {
        return pizza;
    }
}
