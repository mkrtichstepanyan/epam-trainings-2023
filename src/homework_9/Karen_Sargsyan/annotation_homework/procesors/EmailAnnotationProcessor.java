package homework_9.Karen_Sargsyan.annotation_homework.procesors;

import homework_9.Karen_Sargsyan.annotation_homework.error.Error;

import java.lang.reflect.Field;

public class EmailAnnotationProcessor {
    private static final String regex = "^([a-zA-Z0-9\\.]{2,20})(@)([A-Za-z]{2,10})(\\.)([a-z]{2,5})$";

    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String email) {
            if (!isValid(email)) {
                return new Error("The email address is not valid", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }

    public static boolean isValid(String email) {
        return email.matches(regex);
    }

}
