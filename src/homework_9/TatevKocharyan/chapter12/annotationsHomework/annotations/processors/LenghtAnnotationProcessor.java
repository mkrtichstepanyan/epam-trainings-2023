package homework_9.TatevKocharyan.chapter12.annotationsHomework.annotations.processors;

import homework_9.TatevKocharyan.chapter12.annotationsHomework.error.Error;

import java.lang.reflect.Field;

public class LenghtAnnotationProcessor {

    public Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String) {
            String nameLenght = (String) o;
            if (nameLenght.length() < 2 || nameLenght.length() > 30) {
                return (new Error("the cusomer's name is not valid ", field.getName()));
            }
        } else {
            return (new Error("Wrong usage error", field.getName()));
        }

        return null;
    }
}
