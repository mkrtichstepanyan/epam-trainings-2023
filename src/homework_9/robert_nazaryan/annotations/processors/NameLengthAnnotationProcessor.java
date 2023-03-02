package homework_9.robert_nazaryan.annotations.processors;

import homework_9.robert_nazaryan.annotations.Length;
import homework_9.robert_nazaryan.error.Error;

import java.lang.reflect.Field;

public class NameLengthAnnotationProcessor {

    public static Error processAnnotation(Object obj, Field field) throws IllegalAccessException, NoSuchFieldException {
        Object o = field.get(obj);
        if (o instanceof String customerName) {
            Length annotation = field.getAnnotation(Length.class);
            int minLength = annotation.min();
            int maxLength = annotation.max();
            if (customerName.length() < minLength || customerName.length() > maxLength) {
                return new Error("The customer name must be longer than 4 and shorter than 20 digits! ", field.getName());
            }
        } else {
            return new Error("Wrong usage error! ", field.getName());
        }
        System.out.println("Validation process has successfully passed for " + field.getName());
        return null;
    }
}

