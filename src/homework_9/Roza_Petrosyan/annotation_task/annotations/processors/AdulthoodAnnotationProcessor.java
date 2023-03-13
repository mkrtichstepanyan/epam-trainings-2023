package homework_9.Roza_Petrosyan.annotation_task.annotations.processors;

import homework_9.Roza_Petrosyan.annotation_task.annotations.Adulthood;
import homework_9.Roza_Petrosyan.annotation_task.error.Error;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor implements ProcessAnnotation{

    @Override
    public Error processAnnotation(Object obj, Field field) throws IllegalAccessException {
        Object o = field.get(obj);
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
