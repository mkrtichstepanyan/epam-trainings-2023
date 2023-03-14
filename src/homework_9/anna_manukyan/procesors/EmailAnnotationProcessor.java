package homework_9.anna_manukyan.procesors;

import homework_9.anna_manukyan.annotations.Email;
import homework_9.anna_manukyan.error.Error;

import java.lang.reflect.Field;

import static homework_9.anna_manukyan.annotations.Email.regex;


public class EmailAnnotationProcessor {

    public static homework_9.anna_manukyan.error.Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String) {
            String email = (String) o;
            Email annotation = field.getAnnotation(Email.class);
            boolean matches = regex.matcher(email).matches();
            if (!matches) {
                return new Error("The " + email + " is not valid email.", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }

}
