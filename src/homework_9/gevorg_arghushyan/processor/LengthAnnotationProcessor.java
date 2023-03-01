package homework_9.gevorg_arghushyan.processor;

import gevorg_arghushyan.anotation.Length;
import gevorg_arghushyan.dto.CustomerDto;
import gevorg_arghushyan.error.Error;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class LengthAnnotationProcessor {
    public static Error processorLengthAnnotation(CustomerDto customer) throws IllegalAccessException {
        Field[] declaredFields = customer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();

            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof Length) {
                    Length length = (Length) declaredAnnotation;
                    int min = length.min();
                    int max = length.max();
                    if (customer.getName() != null || customer.getName() != "") {
                        if (customer.getName().length() < min || customer.getName().length() > max) {
                            return new Error("Username must not be less than 2 and or than 30 letters", declaredField.getName());
                        }
                    }
                }
            }
        }
        return null;
    }
}