package homework_9.assignment.Zara_Avetyan.Homework.processors;

import homework_9.assignment.Zara_Avetyan.Homework.Adulthood;
import homework_9.assignment.Zara_Avetyan.Homework.Length;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class AdulthoodAnnotationProcess {
    public static boolean Validator(Object obj, Field field) throws IllegalAccessException {
        LocalDate today = LocalDate.now();
        LocalDate birthday = (LocalDate) field.get(obj);
        int minAge = field.getAnnotation(Adulthood.class).minAge();
        if (today.getYear() - birthday.getYear() >= minAge) {
            return false;
        } else {
            return true;
        }
    }
}
