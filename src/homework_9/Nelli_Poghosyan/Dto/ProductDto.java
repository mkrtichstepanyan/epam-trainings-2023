package homework_9.Nelli_Poghosyan.Dto;

import homework_9.Nelli_Poghosyan.Annotation.Length;
import homework_9.Nelli_Poghosyan.Annotation.Max;
import homework_9.Nelli_Poghosyan.Annotation.Min;

public class ProductDto {

    @Length(min=4,max=30)
    private String name;

    @Min()
    @Max()
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
