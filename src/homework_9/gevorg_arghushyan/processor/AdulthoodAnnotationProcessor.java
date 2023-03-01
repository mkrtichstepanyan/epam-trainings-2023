package homework_9.gevorg_arghushyan.processor;
import homework_9.gevorg_arghushyan.anotation.Adulthood;
import homework_9.gevorg_arghushyan.error.Error;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {

    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);

        if (o instanceof LocalDate) {
            LocalDate localDate = (LocalDate) o;
            LocalDate now = LocalDate.now();
            int diff = Period.between(localDate, now).getYears();
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