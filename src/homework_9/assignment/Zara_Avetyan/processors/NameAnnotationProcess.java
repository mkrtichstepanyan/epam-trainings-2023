package homework_9.assignment.Zara_Avetyan.processors;


import homework_9.assignment.Zara_Avetyan.Length;

import java.lang.reflect.Field;

public class NameAnnotationProcess {

    public static boolean Validator(Object obj, Field field) throws IllegalAccessException {
        Length annotation = field.getAnnotation(Length.class);
        int min = annotation.min();
        int max = (field.getAnnotation(Length.class)).max();
        int length = ((String) field.get(obj)).length();
        if (length >= min && length <= max) {
            return false;
        } else {
            return true;
        }
    }
}
