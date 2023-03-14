package homework_9.gohar_hakobyan.annotations.procesors;

import homework_9.gohar_hakobyan.annotations.Max;
import homework_9.gohar_hakobyan.annotations.Min;
import homework_9.gohar_hakobyan.error.Error;

import java.lang.reflect.Field;

public class DiscountProcessor extends AnnotationProcessor {
    @Override
    public Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        if (field.isAnnotationPresent(Min.class) && field.isAnnotationPresent(Max.class)) {
            Object o = field.get(customer);
            if (o instanceof Integer) {
                int rate = (int) o;
                int min = field.getAnnotation(Min.class).value();
                int max = field.getAnnotation(Max.class).value();
                if (rate < min || rate > max) {
                    return new Error("The value of the must be in range ", field.getName() + " "
                            + min + "-" + max);
                }
            } else {
                return new Error("Wrong usage error", field.getName());
            }
        }
        return null;
    }
}
