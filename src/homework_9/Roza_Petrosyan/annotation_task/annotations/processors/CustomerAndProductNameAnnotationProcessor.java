package homework_9.Roza_Petrosyan.annotation_task.annotations.processors;

import homework_9.Roza_Petrosyan.annotation_task.annotations.Length;
import homework_9.Roza_Petrosyan.annotation_task.dto.CustomerDto;
import homework_9.Roza_Petrosyan.annotation_task.dto.ProductDto;
import homework_9.Roza_Petrosyan.annotation_task.error.Error;

import java.lang.reflect.Field;

public class CustomerAndProductNameAnnotationProcessor implements ProcessAnnotation {
    @Override
    public Error processAnnotation(Object obj, Field field) throws IllegalAccessException {
        Length length = field.getAnnotation(Length.class);
        // pattern matching
        if (obj instanceof CustomerDto customerDto) {
            if (customerDto.getName() == null) {
                return new Error("The customer name can not be null", field.getName());

            } else {
                if (customerDto.getName().length() < length.min() || customerDto.getName().length() > length.max()) {
                    return new Error("The customer name can not be less than " +
                            length.min() + " and more than " + length.max() + " characters",
                            field.getName());
                }
            }
        } else if (obj instanceof ProductDto productDto) {
            if (productDto.getName() == null) {
                return new Error("The product name can not be null", field.getName());

            } else {
                if (productDto.getName().length() < length.min() || productDto.getName().length() > length.max()) {
                    return new Error("The product name can not be less than " +
                            length.min() + " and more than " + length.max() + " characters",
                            field.getName());
                }
            }
        }

        return null;
    }
}
