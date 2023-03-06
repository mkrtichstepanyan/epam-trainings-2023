package homework_9.Vladimir_Vanyan.annotations.procesors;

import homework_9.Vladimir_Vanyan.annotations.Email;
import homework_9.Vladimir_Vanyan.error.Error;

import java.lang.reflect.Field;

public class EmailAnnotationProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);

        if (o instanceof String email) {

            Email annotation = field.getAnnotation(Email.class);
            String regex = annotation.regex();
            if (email.matches(regex)) {
                return new Error("The invalid email", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }

        return null;
    }
}
