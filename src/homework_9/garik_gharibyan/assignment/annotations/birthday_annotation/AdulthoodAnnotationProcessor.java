package homework_9.garik_gharibyan.assignment.annotations.birthday_annotation;

import homework_9.garik_gharibyan.assignment.error.Error;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {
    public static Error processAnnotation(Object obj) throws IllegalAccessException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {

                Object o = field.get(obj);
                if (o instanceof LocalDate){
                    LocalDate birthday = (LocalDate) o;
                    LocalDate now = LocalDate.now();
                    int age = Period.between(birthday, now).getYears();
                    Adulthood annotation = field.getAnnotation(Adulthood.class);
                    if (age < annotation.age()) {

                        return new Error("Customer is not at age of majority", field.getName());

                    }
                }else {
                    return new Error("Wrong annotation",field.getName());
                }

            }
        }
        return null;
    }
}
