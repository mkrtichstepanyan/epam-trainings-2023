package homework_7.Araksya_Ghazaryan.product;

public abstract class Product {
    public String name;
    public double price;
    public int quantity;

    public ProductType getProductType(){
        return productType;
    }
    public ProductType productType;
    public abstract double calculatePrice();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


