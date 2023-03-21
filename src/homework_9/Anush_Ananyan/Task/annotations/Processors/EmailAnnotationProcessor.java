package homework_9.Anush_Ananyan.Task.annotations.Processors;


import homework_9.Anush_Ananyan.Task.error.Error;

import java.lang.reflect.Field;


public class EmailAnnotationProcessor {
    public static String emailRegex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String email) {
            if (!isValidEmail(email)) {
                return new Error("The email format is wrong", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
    public static  boolean isValidEmail(String email) {
        return email.matches(emailRegex);
    }
}



