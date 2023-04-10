package homework_9.Diana_Melkonyann.annotations.procesors;

import homework_9.Diana_Melkonyann.annotations.Length;
import homework_9.Diana_Melkonyann.error.Error;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        // pattern matching
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
