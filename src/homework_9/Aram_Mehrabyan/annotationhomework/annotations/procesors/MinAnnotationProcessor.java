package homework_9.Aram_Mehrabyan.annotationhomework.annotations.procesors;

import homework_9.Aram_Mehrabyan.annotationhomework.annotations.Min;
import homework_9.Aram_Mehrabyan.annotationhomework.error.Error;

import java.lang.reflect.Field;

public class MinAnnotationProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        // pattern matching
        if (o instanceof Integer discountRate) {

            Min annotation = field.getAnnotation(Min.class);
            if (discountRate < annotation.value()) {
                return new Error("the number is less than the limit specified in the parameter", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }

}
