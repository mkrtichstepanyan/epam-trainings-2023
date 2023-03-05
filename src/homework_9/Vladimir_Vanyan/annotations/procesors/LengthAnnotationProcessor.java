package homework_9.Vladimir_Vanyan.annotations.procesors;

import homework_9.Vladimir_Vanyan.annotations.Length;
import homework_9.Vladimir_Vanyan.error.Error;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor {
    public static Error processAnnotation(Object costomer, Field field) throws IllegalAccessException {
        Object o = field.get(costomer);
        if (o instanceof String name) {
            int length = name.length();
            Length annotation = field.getAnnotation(Length.class);
            if (length < annotation.min() || length > annotation.max()) {
                return new Error("The customer name is out of range", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}
