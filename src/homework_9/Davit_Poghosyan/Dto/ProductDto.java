package homework_9.Davit_Poghosyan.Dto;

import homework_9.Davit_Poghosyan.Annotation.Length;
import homework_9.Davit_Poghosyan.Annotation.Max;
import homework_9.Davit_Poghosyan.Annotation.Min;

public class ProductDto {

    @Length(min=4,max=30)
    private String name;

    @Min(10)
    @Max(50)
    private double price;

    public ProductDto(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
