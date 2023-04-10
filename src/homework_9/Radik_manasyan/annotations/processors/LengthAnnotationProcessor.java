package homework_9.Radik_manasyan.annotations.processors;
import homework_9.Radik_manasyan.errors.Error;
import homework_9.Radik_manasyan.annotations.Length;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor {
    public static Error lengthProcessor(Object object, Field field) throws IllegalAccessException {
        String objGetName = (String) field.get(object);
        Length annotation = field.getAnnotation(Length.class);
        int min = annotation.min();
        int max = annotation.max();

        if (objGetName.length() < min) {
            return new Error("Input correct name! Min names length equals " + min, field.getName());
        } else if (objGetName.length() > max) {
            return new Error("Input correct name! Max name length equals " + max, field.getName());
        }
        return null;
    }
}
