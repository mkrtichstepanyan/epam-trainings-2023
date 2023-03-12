package homework_9.Roza_Petrosyan.annotation_task.annotations.processors;

import homework_9.Roza_Petrosyan.annotation_task.error.Error;
import homework_9.Roza_Petrosyan.annotation_task.dto.CustomerDto;

import java.lang.reflect.Field;

public class EmailAnnotationProcessor implements ProcessAnnotation{
    @Override
    public Error processAnnotation(Object obj, Field field) throws IllegalAccessException {
        // pattern matching
        if (obj instanceof CustomerDto customerDto) {
            if (customerDto.getEmail() == null) {
                return new Error("The customer email can not be null", field.getName());
            } else {
                if (!customerDto.getEmail().matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9]" +
                        "(?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?" +
                        "(?:\\.[a-zA-Z0-9]" +
                        "(?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$")) {
                    return new Error("The customer email is not valid", field.getName());
                }
            }
        }
        return null;
    }
}
