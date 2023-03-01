package homework_9.garik_gharibyan.assignment.annotations.email_annotation;

import homework_9.garik_gharibyan.assignment.error.Error;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAnnotationProcessor {

    public static Error processAnnotation(Object obj) throws IllegalAccessException {

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Email.class)) {

                Object o = field.get(obj);
                if (o instanceof String){

                    String email = (String) o;
                    String regex = field.getAnnotation(Email.class).email();
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(email);
                    boolean isMatch = matcher.find();
                    if (!isMatch) {
                        return new Error(email + " - invalid email", field.getName());
                    }
                }else {
                    return new Error("Wrong annotation",field.getName());
                }
            }
        }
        return null;
    }
}