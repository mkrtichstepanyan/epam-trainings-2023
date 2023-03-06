package homework_9.Vladimir_Vanyan.annotations.procesors;

import homework_9.Vladimir_Vanyan.error.Error;
import homework_9.Vladimir_Vanyan.annotations.Adulthood;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {
    public static Error processAnnotation(Object costomer, Field field) throws IllegalAccessException {
        Object o = field.get(costomer);
        if (o instanceof LocalDate birthDate) {
            LocalDate now = LocalDate.now();
            int diff = Period.between(birthDate, now).getYears();
            Adulthood annotation = field.getAnnotation(Adulthood.class);
            if (diff < annotation.age()) {
                return new Error("The customer has not reached required age", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}
