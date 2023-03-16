package homework_9.Nelli_Poghosyan.Annotation.Processors;



import homework_9.Nelli_Poghosyan.Annotation.AdultHood;
import homework_9.Nelli_Poghosyan.Validation.Error;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdultHoodProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        // pattern matching
        if (o instanceof LocalDate birthDate) {
            LocalDate now = LocalDate.now();
            int diff = Period.between(birthDate, now).getYears();
            AdultHood annotation = field.getAnnotation(AdultHood.class);
            if (diff < annotation.age()) {
                return new Error("The customer has not reached required age", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }

}