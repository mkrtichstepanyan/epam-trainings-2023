package homework_9.Roza_Petrosyan.Dto;

import homework_9.Roza_Petrosyan.Annotation.Length;
import homework_9.Roza_Petrosyan.Annotation.Max;
import homework_9.Roza_Petrosyan.Annotation.Min;

public class ProductDto {
    @Length(min = 4, max = 20, message = "Product name can not be less than 4 and more than 20 characters")
    private String name;

    private int price;

    @Min(value = 1, message = "Product quantity can not be less than 1")
    @Max(value = 10, message = "Product quantity can not be more than 10")
    private int quantity;

    public ProductDto(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
