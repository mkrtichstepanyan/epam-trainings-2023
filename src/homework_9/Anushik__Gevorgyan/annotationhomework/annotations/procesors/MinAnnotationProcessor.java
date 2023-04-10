package homework_9.Anushik__Gevorgyan.annotationhomework.annotations.procesors;

import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.Min;
import homework_9.Anushik__Gevorgyan.annotationhomework.error.Error;

import java.lang.reflect.Field;

public class MinAnnotationProcessor {

    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof Integer min) {
            Min annotation = field.getAnnotation(Min.class);
            int minValue = annotation.minValue();
            if (min < minValue) {
                return new Error("The value is less than the limit!", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        System.out.println("Validation process has successfully passed " + field.getName());
        return null;
    }
}