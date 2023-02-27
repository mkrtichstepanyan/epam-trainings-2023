package classwork.annotationhomework.annotations.procesors;

import classwork.annotationhomework.CustomerDto;
import classwork.annotationhomework.error.Error;
import classwork.annotationhomework.annotations.Adulthood;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {

    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        // pattern matching
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
