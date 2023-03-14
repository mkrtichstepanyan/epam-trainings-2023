package homework_9.anna_manukyan.procesors;

import homework_9.anna_manukyan.annotations.Length;
import homework_9.anna_manukyan.error.Error;

import java.lang.reflect.Field;

public class NameAnnotationProcessor {
    public static homework_9.anna_manukyan.error.Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String) {
            String name = (String) o;
            Length annotation = field.getAnnotation(Length.class);
            int max = annotation.max();
            int min = annotation.min();
            if (name.length() < min || name.length() > max) {
                return new Error("Customer name " + name +
                        " must have min " + min + " and max " + max + "length", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }

}
