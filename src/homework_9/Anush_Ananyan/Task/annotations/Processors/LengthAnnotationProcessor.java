package homework_9.Anush_Ananyan.Task.annotations.Processors;


import homework_9.Anush_Ananyan.Task.annotations.Length;
import homework_9.Anush_Ananyan.Task.error.Error;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor {
    public static String name;

    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String name) {
            Length annotation = field.getAnnotation(Length.class);
            int minValue = annotation.min();
            int maxValue = annotation.max();
            if (name.length() < minValue || name.length() > maxValue) {
                return new Error("The customer name is not correct", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}

