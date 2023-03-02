package homework_9.Diana_Melkonyann.annotations.procesors;

import homework_9.Diana_Melkonyann.annotations.Min;
import homework_9.Diana_Melkonyann.error.Error;

import java.lang.reflect.Field;
public class MinAnnotetionProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        // pattern matching
        if (o instanceof Integer discountRate) {

            Min annotation = field.getAnnotation(Min.class);
            if (discountRate < annotation.min()) {
                return new Error("number is less than the value specified in the parameter", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }

}
