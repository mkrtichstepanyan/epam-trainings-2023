package homework_9.gevorg_arghushyan.processor;

import gevorg_arghushyan.anotation.Max;
import gevorg_arghushyan.anotation.Min;
import gevorg_arghushyan.dto.CustomerDto;
import gevorg_arghushyan.error.Error;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MinProcessor {

    public static Error minAnnotation(CustomerDto customer) throws IllegalAccessException {

        Field[] declaredFields = customer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof Min) {
                    Min min = (Min) declaredAnnotation;
                    int minRate = min.min();
                    if (customer.getDiscountRate() < minRate) {
                        return new Error("Min Rate must be 0", declaredField.getName());
                    }
                }
            }
        }
        return null;
    }
}

