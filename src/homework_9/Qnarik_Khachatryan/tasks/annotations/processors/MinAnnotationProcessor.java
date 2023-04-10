package homework_9.Qnarik_Khachatryan.tasks.annotations.processors;

import homework_9.Qnarik_Khachatryan.tasks.annotations.Min;
import homework_9.Qnarik_Khachatryan.tasks.error.Error;

import java.lang.reflect.Field;

public class MinAnnotationProcessor {

    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof Integer min) {
            Min annotation = field.getAnnotation(Min.class); // to get min default value
            int minValue = annotation.value();
            if (min < minValue) {
                return new Error("The value is less than the limit!", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}
