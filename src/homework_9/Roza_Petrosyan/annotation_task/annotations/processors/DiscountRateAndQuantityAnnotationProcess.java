package homework_9.Roza_Petrosyan.annotation_task.annotations.processors;

import homework_9.Roza_Petrosyan.annotation_task.annotations.Max;
import homework_9.Roza_Petrosyan.annotation_task.annotations.Min;
import homework_9.Roza_Petrosyan.annotation_task.dto.CustomerDto;
import homework_9.Roza_Petrosyan.annotation_task.dto.ProductDto;
import homework_9.Roza_Petrosyan.annotation_task.error.Error;

import java.lang.reflect.Field;

public class DiscountRateAndQuantityAnnotationProcess implements ProcessAnnotation{
    @Override
    public Error processAnnotation(Object obj, Field field) throws IllegalAccessException {
        Min min = field.getAnnotation(Min.class);
        Max max = field.getAnnotation(Max.class);
        // pattern matching
        if (obj instanceof CustomerDto customerDto) {
            if (customerDto.getDiscountRate() < min.value() || customerDto.getDiscountRate() > max.value()) {
                return new Error("Discount rate can not be less than " +
                        min.value() + " and more than " + max.value(),
                        field.getName());
            }
        } else if (obj instanceof ProductDto productDto) {
            if (productDto.getQuantity() < min.value() || productDto.getQuantity() > max.value()) {
                return new Error("Product quantity can not be less than " +
                        min.value() + " and more than " + max.value(),
                        field.getName());
            }
        }

        return null;
    }
}
