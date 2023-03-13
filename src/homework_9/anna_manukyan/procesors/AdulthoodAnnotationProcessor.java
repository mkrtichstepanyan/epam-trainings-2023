package homework_9.anna_manukyan.procesors;

import homework_9.anna_manukyan.annotations.Adulthood;
import homework_9.anna_manukyan.error.Error;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class AdulthoodAnnotationProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof LocalDate) {
            LocalDate localDate = (LocalDate) (o);
            int birthday = (int) localDate.toEpochDay();
            int now = (int) LocalDate.now().toEpochDay();
            int age = (now - birthday) / 365;
            Adulthood ageAnnotation = field.getAnnotation(Adulthood.class);
            int value = ageAnnotation.value();
            if (value > age) {
                return new Error("Customer age is " + age +
                        ". It must not be less then " + value + " age ", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }

}
