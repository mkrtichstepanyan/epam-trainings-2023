package homework_9.Varsik_Pijoyan.AnnotationHomework.annotations.processors;

import homework_9.Varsik_Pijoyan.AnnotationHomework.annotations.Max;
import homework_9.Varsik_Pijoyan.AnnotationHomework.errors.Error;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);

        if (o instanceof Integer discountRate) {

            Max annotation = field.getAnnotation(Max.class);
            if (discountRate > annotation.value()) {
                return new Error("number is more than the value specified in the parameter", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}
