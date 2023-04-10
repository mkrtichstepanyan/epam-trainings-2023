package homework_9.assignment.hovhannes_gspeyan.annotations.processors;

import homework_9.assignment.hovhannes_gspeyan.annotations.Email;
import homework_9.assignment.hovhannes_gspeyan.error.Error;

import java.lang.reflect.Field;

public class EmailAnnotationProcessor {

    public static Error processAnnotation(Object obj, Field field) throws IllegalAccessException {
        Object o = field.get(obj);
        if (o instanceof String customerEmail) {
            Email annotation = field.getAnnotation(Email.class);
            String regex = annotation.regex();
            if (!customerEmail.matches(regex)) {
                return new Error("The customer email must match required Email standards ", field.getName());
            }
        } else {
            return new Error("Wrong usage error! ", field.getName());
        }
        System.out.println("Validation process has successfully passed for " + field.getName());
        return null;
    }
}
