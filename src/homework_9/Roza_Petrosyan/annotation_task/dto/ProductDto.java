package homework_9.Roza_Petrosyan.annotation_task.dto;

import homework_9.Roza_Petrosyan.annotation_task.annotations.Length;
import homework_9.Roza_Petrosyan.annotation_task.annotations.Max;
import homework_9.Roza_Petrosyan.annotation_task.annotations.Min;

public class ProductDto {
    @Length(min = 4, max = 20)
    private String name;

    private int price;

    @Min(1)
    @Max(10)
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
