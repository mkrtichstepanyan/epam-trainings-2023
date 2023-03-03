package homework_9.Ani_Kovalenko.Annotation_Homework.annotations.procesors;

import homework_9.Ani_Kovalenko.Annotation_Homework.annotations.Email;
import homework_9.Ani_Kovalenko.Annotation_Homework.error.Error;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAnnotationProcessor {
    private static final String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA" +
            "-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String email) {
            Email annotation = field.getAnnotation(Email.class);
            if (!isValid(email)) {
                return new Error("The email address is not valid", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }

    public static boolean isValid(String email) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
