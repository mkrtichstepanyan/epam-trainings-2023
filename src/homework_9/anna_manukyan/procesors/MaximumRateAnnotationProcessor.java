package homework_9.anna_manukyan.procesors;

import homework_9.anna_manukyan.annotations.Max;
import homework_9.anna_manukyan.error.Error;

import java.lang.reflect.Field;

public class MaximumRateAnnotationProcessor {
    public static homework_9.anna_manukyan.error.Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof Integer) {
            int max = (int) o;
            Max annotation = field.getAnnotation(Max.class);
            int value = annotation.value();
            if (max > value) {
                return new Error("Customer discount rate (" + max + ") must  be less then " + value, field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }

}
