package homework_9.TatevKocharyan.chapter12.annotationsHomework.annotations.processors;

import homework_9.TatevKocharyan.chapter12.annotationsHomework.error.Error;
import homework_9.TatevKocharyan.chapter12.annotationsHomework.annotations.Adulthood;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {

    public Error processAnnotation(Object customer, Field field) throws IllegalAccessException {

        Object o = field.get(customer);
        if (o instanceof LocalDate) {
            LocalDate birthdate = (LocalDate) o;
            LocalDate now = LocalDate.now();
            int diff = Period.between(birthdate, now).getYears();
            Adulthood annotation = field.getAnnotation(Adulthood.class);
            if (diff < annotation.age() || diff > 100) {
                return (new Error("the cusomer has not reached the required age.", " " + field.getName() + " is set wrong"));

            }

        } else {
            return (new Error("Wrong usage error", field.getName()));
        }

        return null;
    }

}
