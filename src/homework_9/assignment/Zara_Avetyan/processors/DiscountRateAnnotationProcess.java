package homework_9.assignment.Zara_Avetyan.processors;

import homework_9.assignment.Zara_Avetyan.Max;
import homework_9.assignment.Zara_Avetyan.Min;

import java.lang.reflect.Field;

public class DiscountRateAnnotationProcess {
    public static boolean Validator(Object obj, Field field) throws IllegalAccessException {
        int min = field.getAnnotation(Min.class).value();
        int max = field.getAnnotation(Max.class).value();
        int discountRate = (int) field.get(obj);
        if (discountRate >= min && discountRate <= max) {
            return false;
        } else {
            return true;
        }
    }
}
