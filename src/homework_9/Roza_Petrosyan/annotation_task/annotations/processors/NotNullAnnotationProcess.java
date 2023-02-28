package homework_9.Roza_Petrosyan.annotation_task.annotations.processors;

import homework_9.Roza_Petrosyan.annotation_task.dto.CustomerDto;
import homework_9.Roza_Petrosyan.annotation_task.dto.ProductDto;
import homework_9.Roza_Petrosyan.annotation_task.error.Error;

import java.lang.reflect.Field;

public class NotNullAnnotationProcess implements ProcessAnnotation{
    @Override
    public Error processAnnotation(Object obj, Field field) throws IllegalAccessException {
        if (obj instanceof CustomerDto customerDto) {
            if (customerDto.getName() == null || customerDto.getEmail() == null) {
                return new Error("The customer name can not be null", field.getName());
            }
        } else if (obj instanceof ProductDto productDto) {
            if (productDto.getName() == null) {
                return new Error("The product name can not be null", field.getName());
            }
        }
        return null;
    }
}
