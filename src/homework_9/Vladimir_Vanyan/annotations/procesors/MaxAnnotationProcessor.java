package homework_9.Vladimir_Vanyan.annotations.procesors;

import homework_9.Vladimir_Vanyan.annotations.Max;
import homework_9.Vladimir_Vanyan.error.Error;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof Integer discountRate) {
            Max annotation = field.getAnnotation(Max.class);
            if (discountRate > annotation.max()) {
                return new Error("number is more than the value specified in the parameter", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}
