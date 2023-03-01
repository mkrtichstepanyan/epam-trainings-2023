package homework_9.gevorg_arghushyan.processor;
import homework_9.gevorg_arghushyan.anotation.Email;
import homework_9.gevorg_arghushyan.dto.CustomerDto;
import homework_9.gevorg_arghushyan.error.Error;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailProcessor {

    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIl_REGEX = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}" +
            "~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA" +
            "-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    public static Error processorEmailAnnotation(CustomerDto customer) throws IllegalAccessException {
        Field[] declaredFields = customer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof Email) {
                    if (!isValid(customer.getEmail())) {
                        return new Error("This email is incorrect", declaredField.getName());
                    }
                }
            }
        }
        return null;
    }

    private static boolean isValid(String email) {
        pattern = Pattern.compile(EMAIl_REGEX);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}