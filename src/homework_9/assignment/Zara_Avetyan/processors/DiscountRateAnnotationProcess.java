package homework_9.assignment.Zara_Avetyan.Homework.processors;

import homework_9.assignment.Zara_Avetyan.Homework.Adulthood;
import homework_9.assignment.Zara_Avetyan.Homework.Max;
import homework_9.assignment.Zara_Avetyan.Homework.Min;

import java.lang.reflect.Field;
import java.time.LocalDate;

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
