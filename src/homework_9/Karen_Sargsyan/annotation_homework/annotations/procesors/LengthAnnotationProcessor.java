package homework_9.Karen_Sargsyan.annotation_homework.annotations.procesors;

import homework_9.Karen_Sargsyan.annotation_homework.error.Error;
import homework_9.Karen_Sargsyan.annotation_homework.annotations.Length;

import java.lang.reflect.Field;
public class LengthAnnotationProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String name) {
            Length annotation = field.getAnnotation(Length.class);
            if (name.length() < annotation.min() || name.length() > annotation.max()) {
                return new Error("The name length should be within the defined range", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}
