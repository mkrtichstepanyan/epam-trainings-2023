package homework_9.Anushik__Gevorgyan.annotationhomework.annotations.procesors;




import homework_9.Qnarik_Khachatryan.tasks.annotations.Length;
import homework_9.Qnarik_Khachatryan.tasks.error.Error;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor {


    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String name) {
            Length annotation = field.getAnnotation(Length.class); // to get min and max default values
            int minValue = annotation.min();
            int maxValue = annotation.max();
            if (name.length() > maxValue || name.length() < minValue) {
                return new Error("The length of the name doesn't match the specified range!", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}