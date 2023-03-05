package homework_9.Yeghia_Ansuryan.annotation_homework.annotations.Procesors;

import homework_9.Yeghia_Ansuryan.annotation_homework.annotations.Max;
import homework_9.Yeghia_Ansuryan.annotation_homework.annotations.Min;
import homework_9.Yeghia_Ansuryan.annotation_homework.error.Error;

import java.lang.reflect.Field;

public class MinMaxAnnotationProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof Integer discountRate) {
            Max annotationMax = field.getAnnotation(Max.class);
            Min annotationMin = field.getAnnotation(Min.class);
            if (discountRate < annotationMin.value() || discountRate > annotationMax.value()) {
                return new Error("The rate should be within the range", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}
