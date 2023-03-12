package homework_9.Radik_manasyan.annotations.processors;

import homework_9.Radik_manasyan.errors.Error;
import homework_9.Radik_manasyan.annotations.Max;
import homework_9.Radik_manasyan.annotations.Min;

import java.lang.reflect.Field;

public class MinAndMaxAnnotationProcessor {
    public static Error minProcessor(Object object, Field field) throws IllegalAccessException {
        int minDiscountRate = (int) field.get(object);
        Min annotation = field.getAnnotation(Min.class);
        int min = annotation.value();
        if (min == minDiscountRate) {
            return new Error("Limit must be greater than 0", field.getName());
        } else if (field.isAnnotationPresent(Max.class)) {
            int maxDiscountRate = (int) field.get(object);
            Max mAnnotation = field.getAnnotation(Max.class);
            int max = mAnnotation.value();
            if (max < maxDiscountRate) {
                return new Error("Limit must be less than 100", field.getName());
            }
        }
        return null;
    }
}
