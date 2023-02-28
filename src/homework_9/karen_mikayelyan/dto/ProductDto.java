package homework_9.karen_mikayelyan.dto;

import homework_9.karen_mikayelyan.annotation.Length;
import homework_9.karen_mikayelyan.annotation.Max;
import homework_9.karen_mikayelyan.annotation.Min;

public class ProductDto {
    @Length(min = 4, max = 20, message = "Product name can not be less then 4 and more then 20 characters")
    private String name;

    private double price;

    @Min(value = 1, message = "Product quantity can not be less then 1")
    @Max(value = 10, message = "Product quantity can not be more then 10")
    private int quantity;

    public ProductDto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
}
