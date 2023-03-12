package homework_9.Radik_manasyan.annotations.processors;

import homework_9.Radik_manasyan.errors.Error;
import homework_9.Radik_manasyan.annotations.Email;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAnnotationProcessor {
    public static Error emailProcessor(Object object, Field field) throws IllegalAccessException {
        String objGetEmail = (String) field.get(object);
        Email annotation = field.getAnnotation(Email.class);
        String value = annotation.value();
        Pattern compile = Pattern.compile(value);
        Matcher matcher = compile.matcher(objGetEmail);

        if (!matcher.matches()) {
            return new Error("Input correct email:", field.getName());
        }
        return null;
    }
}
