package homework_9.robert_nazaryan.annotations.processors;

import homework_9.robert_nazaryan.annotations.Adulthood;
import homework_9.robert_nazaryan.error.Error;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {

    public static Error processAnnotation(Object obj, Field field) throws IllegalAccessException {
        Object o = field.get(obj);
        if (o instanceof LocalDate birthdate) {
            LocalDate now = LocalDate.now();
            int diff = Period.between(birthdate, now).getYears();
            Adulthood annotation = field.getAnnotation(Adulthood.class);
            if (diff < annotation.adultAge()) {
                return new Error("The customer has not reached the required age! ", field.getName());
            }
        } else {
            return new Error("Wrong usage error! ", field.getName());
        }
        System.out.println("Validation process has successfully passed " + field.getName());
        return null;
    }
}
