package homework_9.Nelli_Poghosyan.Annotation.Processors;

import homework_9.Nelli_Poghosyan.Annotation.AdultHood;
import homework_9.Nelli_Poghosyan.Annotation.Length;
import homework_9.Nelli_Poghosyan.Dto.CustomerDto;
import homework_9.Nelli_Poghosyan.Validation.Error;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class CustomerNameLengthProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        // pattern matching
        if (o instanceof String name) {
            Length annotation = field.getAnnotation(Length.class);
            if (name.length() < annotation.min() || name.length() > annotation.max()) {
                return new Error(annotation.message(), field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}
