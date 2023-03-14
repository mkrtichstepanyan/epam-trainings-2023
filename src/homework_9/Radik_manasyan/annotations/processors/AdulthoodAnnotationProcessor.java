package homework_9.Radik_manasyan.annotations.processors;

import homework_9.Radik_manasyan.errors.Error;
import homework_9.Radik_manasyan.annotations.Adulthood;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class AdulthoodAnnotationProcessor {
    public static Error adulthoodProcessor(Object object, Field field) throws IllegalAccessException {
        LocalDate now = LocalDate.now();
        LocalDate birthday = (LocalDate) field.get(object);
        Adulthood annotation = field.getAnnotation(Adulthood.class);
        int age = annotation.age();
        if (now.getYear() - birthday.getYear() < age) {
            return new Error("Person age is less than " + age, field.getName());
        }
        return null;
    }
}
