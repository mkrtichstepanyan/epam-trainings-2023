package homework_9.Qnarik_Khachatryan.tasks.annotations.processors;

import homework_9.Qnarik_Khachatryan.tasks.annotations.Max;
import homework_9.Qnarik_Khachatryan.tasks.error.Error;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor {

    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof Integer max) {
            Max annotation = field.getAnnotation(Max.class); // to get max default values
            int maxValue = annotation.value();
            if (max > maxValue) {
                return new Error("The value is more than the limit!", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}
