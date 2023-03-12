package homework_9.gohar_hakobyan.annotations.procesors;

import homework_9.gohar_hakobyan.annotations.Length;
import homework_9.gohar_hakobyan.error.Error;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor extends AnnotationProcessor {

    @Override
    public Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        if (field.isAnnotationPresent(Length.class)) {
            Object o = field.get(customer);
            if (o instanceof String) {
                String name = (String) o;
                Length annotation = field.getAnnotation(Length.class);
                int max = annotation.max();
                int min = annotation.min();
                if (name.length() < min || name.length() > max) {
                    return new Error("Length of the field  is not in range " +
                            min + " and " + max + " ", field.getName());
                }
            } else {
                return new Error("Wrong usage error", field.getName());
            }
        }
        return null;
    }
}
