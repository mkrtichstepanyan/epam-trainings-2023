package homework_9.gohar_hakobyan.annotations.procesors;

import homework_9.gohar_hakobyan.annotations.Email;
import homework_9.gohar_hakobyan.error.Error;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailAnnotationProcessor extends AnnotationProcessor {
    @Override
    public Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String && field.isAnnotationPresent(Email.class)) {
            String email = o.toString();
            if (!validateEmail(email)) {
                return new Error("Email field  is not valid", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }


    private static boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
        Pattern p = Pattern.compile(regex);
        return p.matcher(email).matches();
    }
}

