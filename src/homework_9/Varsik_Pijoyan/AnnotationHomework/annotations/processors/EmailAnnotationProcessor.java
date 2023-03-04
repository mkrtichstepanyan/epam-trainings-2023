package homework_9.Varsik_Pijoyan.AnnotationHomework.annotations.processors;

import homework_9.Varsik_Pijoyan.AnnotationHomework.errors.Error;
import homework_9.Varsik_Pijoyan.AnnotationHomework.annotations.Email;

import java.lang.reflect.Field;

public class EmailAnnotationProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);

        if (o instanceof String email) {

            Email annotation = field.getAnnotation(Email.class);
            String regex= annotation.emailRegex();
            if (email.matches(regex)){
                return new Error("The invalid email", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }

        return null;
    }
}
