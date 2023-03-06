package homework_9.Vladimir_Vanyan.annotations.procesors;

import homework_9.Vladimir_Vanyan.annotations.Min;
import homework_9.Vladimir_Vanyan.error.Error;

import java.lang.reflect.Field;

public class MinAnnotationProcessor {
    public static Error processAnnotation(Object costomer, Field field) throws IllegalAccessException {
        Object o = field.get(costomer);
        if (o instanceof Integer discountRate) {
            Min annotation = field.getAnnotation(Min.class);
            if (discountRate < annotation.min()) {
                return new Error("Number is less than the value specified in the parameter", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}

