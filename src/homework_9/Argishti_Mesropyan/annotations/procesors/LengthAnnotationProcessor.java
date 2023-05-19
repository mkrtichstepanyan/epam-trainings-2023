package homework_9.Argishti_Mesropyan.annotations.procesors;

import homework_9.Argishti_Mesropyan.annotations.Length;
import homework_9.Argishti_Mesropyan.annotations.error.Error;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String name) {
            Length annotation = field.getAnnotation(Length.class);
            if (name.length() < annotation.min() || name.length() > annotation.max()) {
                return new Error("Error", field.getName());
            }
        } else {
            return new Error("error", field.getName());
        }
        return null;
    }
}
