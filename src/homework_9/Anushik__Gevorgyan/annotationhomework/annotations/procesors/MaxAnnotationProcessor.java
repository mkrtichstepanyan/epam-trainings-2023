package homework_9.Anushik__Gevorgyan.annotationhomework.annotations.procesors;

import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.Max;
import homework_9.Anushik__Gevorgyan.annotationhomework.error.Error;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor {

    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof Integer max) {
            Max annotation = field.getAnnotation(Max.class);
            int maxValue = annotation.maxValue();
            if (max > maxValue) {
                return new Error("The value is more than the limit!", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        System.out.println("Validation process has successfully passed " + field.getName());
        return null;
    }
}
