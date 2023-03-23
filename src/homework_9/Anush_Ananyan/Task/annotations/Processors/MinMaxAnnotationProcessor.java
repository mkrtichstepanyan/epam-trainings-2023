package homework_9.Anush_Ananyan.Task.annotations.Processors;

import homework_9.Anush_Ananyan.Task.annotations.Max;
import homework_9.Anush_Ananyan.Task.annotations.Min;
import homework_9.Anush_Ananyan.Task.error.Error;

import java.lang.reflect.Field;

public class MinMaxAnnotationProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof Integer discountRate) {
            Min annotationMin = field.getAnnotation(Min.class);
            Max annotationMax = field.getAnnotation(Max.class);
            if (discountRate < annotationMin.value() || discountRate > annotationMax.value()) {
                return new Error("Invalid discount rate", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}

