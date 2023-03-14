package homework_9.Nelli_Poghosyan.Annotation.Processors;

import homework_9.Nelli_Poghosyan.Annotation.AdultHood;
import homework_9.Nelli_Poghosyan.Dto.CustomerDto;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdultHoodProcessor {
    public static Error checkAdultHood(Field field, CustomerDto customer) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof LocalDate) {
            LocalDate birthDay = (LocalDate) o;
            LocalDate now = LocalDate.now();
            int diff = Period.between(birthDay, now).getYears();

            AdultHood adultHood = field.getAnnotation(AdultHood.class);
            if (diff < 18) {
                return new Error(adultHood.message());
            } else {
                System.out.println("Customer age is more 18");
            }
        }
    return new Error("Wrong usage "+field.getName());
    }
}
