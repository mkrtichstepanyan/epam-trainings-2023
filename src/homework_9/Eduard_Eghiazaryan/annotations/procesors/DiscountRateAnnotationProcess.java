package homework_9.Eduard_Eghiazaryan.annotations.procesors;

import homework_9.Eduard_Eghiazaryan.annotations.Max;
import homework_9.Eduard_Eghiazaryan.annotations.Min;
import homework_9.Eduard_Eghiazaryan.error.Error;

import java.lang.reflect.Field;

public class DiscountRateAnnotationProcess {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof Integer value) {
            Min minAnnotation = field.getAnnotation(Min.class);
            Max maxAnnotation = field.getAnnotation(Max.class);
            if (value < minAnnotation.value() || value > maxAnnotation.value()) {
                return new Error("The discount rate should be more than 0 and less than 100", field.getName());
            } else return new Error("Wrong error usage", field.getName());
        }
        System.out.println("Validation is passed for " + field.getName());
        return null;
    }
}
