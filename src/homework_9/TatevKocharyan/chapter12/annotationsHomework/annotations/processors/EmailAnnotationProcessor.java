package homework_9.TatevKocharyan.chapter12.annotationsHomework.annotations.processors;

import homework_9.TatevKocharyan.chapter12.annotationsHomework.error.Error;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAnnotationProcessor {
    public Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String) {
            String email = (String) o;
            String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if (!matcher.matches()) {
                return (new Error("the cusomer's email is wrong", " " + field.getName() + " is set wrong"));

            }

        } else {
            return (new Error("Wrong usage error", field.getName()));
        }

        return null;
    }
}
