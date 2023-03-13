package homework_9.anna_manukyan.procesors;

import homework_9.anna_manukyan.annotations.Min;
import homework_9.anna_manukyan.error.Error;

import java.lang.reflect.Field;

public class MinimumRateAnnotationProcessor {
    public static homework_9.anna_manukyan.error.Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof Integer) {
            int min = (int) o;
            Min annotation = field.getAnnotation(Min.class);
            int value = annotation.value();
            if (min < value) {
                return new Error("Customer discount rate (" + min + ") must  be less then " + value, field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }

}
