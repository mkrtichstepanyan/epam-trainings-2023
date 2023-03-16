package homework_9.assignment.Zara_Avetyan.processors;

import homework_9.assignment.Zara_Avetyan.Email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.lang.reflect.Field;

public class EmailAnnotationProcess {
    public static boolean Validator(Object obj, Field field) throws IllegalAccessException {
        String regex = (field.getAnnotation(Email.class)).regex();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((String) field.get(obj));
        if (matcher.matches()) {
            return false;
        } else {
            return true;
        }
    }
}