package homework_9.gevorg_arghushyan.processor;

import homework_9.gevorg_arghushyan.anotation.Max;
import homework_9.gevorg_arghushyan.dto.CustomerDto;
import homework_9.gevorg_arghushyan.error.Error;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MaxProcessor {

    public static Error maxAnnotation(CustomerDto customer) throws IllegalAccessException {
        Field[] declaredFields = customer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof Max) {
                    Max max = (Max) declaredAnnotation;
                    int maxRate = max.max();
                    if (customer.getDiscountRate() > maxRate) {
                        return new Error("Max maxRate must be 100", declaredField.getName());
                    }
                }
            }
        }

        return null;
    }
}

