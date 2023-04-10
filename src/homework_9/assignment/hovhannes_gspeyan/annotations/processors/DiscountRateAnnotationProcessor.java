package homework_9.assignment.hovhannes_gspeyan.annotations.processors;

import homework_9.assignment.hovhannes_gspeyan.annotations.Max;
import homework_9.assignment.hovhannes_gspeyan.annotations.Min;
import homework_9.assignment.hovhannes_gspeyan.error.Error;

import java.lang.reflect.Field;

public class DiscountRateAnnotationProcessor {

    public static Error processAnnotation(Object obj, Field field) throws IllegalAccessException {
        Object o = field.get(obj);
        if (o instanceof Double value) {
            Min minAnno = field.getAnnotation(Min.class);
            Max maxAnno = field.getAnnotation(Max.class);
            double min = minAnno.minValue();
            double max = maxAnno.maxValue();
            if (value < min || value > max) {
                return new Error("The discount rate must be more than 0 and less than 100! ", field.getName());
            }
        } else {
            return new Error("Wrong usage error! ", field.getName());
        }
        System.out.println("Validation process has successfully passed for " + field.getName());
        return null;
    }
}
