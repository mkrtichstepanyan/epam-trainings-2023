package homework_9.TatevKocharyan.chapter12.annotationsHomework.annotations.processors;

import homework_9.TatevKocharyan.chapter12.annotationsHomework.error.Error;

import java.lang.reflect.Field;

public class MaxAnnotationProcessor {

    public Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof Integer) {
            Integer maxValue = (Integer) o;
            if (maxValue < 10 || maxValue > 30) {
                return (new Error("the discount rate is not valid ", field.getName()));
            }
        } else {
            return (new Error("Wrong usage error", field.getName()));
        }

        return null;
    }

}
