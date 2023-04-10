package homework_9.TatevKocharyan.chapter12.annotationsHomework.annotations.processors;

import homework_9.TatevKocharyan.chapter12.annotationsHomework.error.Error;

import java.lang.reflect.Field;

public class MinAnnotationProcessor {

    public Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof Integer) {
            Integer minValue = (Integer) o;
            if (minValue > 10) {
                return (new Error("the discount rate is not valid ", " " + field.getName()));

            }
        } else {
            return (new Error("Wrong usage error", field.getName()));
        }

        return null;
    }

}
