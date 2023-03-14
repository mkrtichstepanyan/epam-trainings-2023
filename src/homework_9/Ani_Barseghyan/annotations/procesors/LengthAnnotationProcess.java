package homework_9.Ani_Barseghyan.annotations.procesors;

import homework_9.Ani_Barseghyan.annotations.Length;
import homework_9.Ani_Barseghyan.error.Error;

import java.lang.reflect.Field;

public class LengthAnnotationProcess {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String name) {
            Length annotation = field.getAnnotation(Length.class);
            if (name.length() < annotation.min() || name.length() > annotation.max()) {
                return new Error("The customer name is not meeting the requirement", field.getName());
            }
        }
        System.out.println("Validation is passed for " + field.getName());
        return null;
    }
}
