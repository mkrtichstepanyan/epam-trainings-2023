package homework_9.Ani_Barseghyan.annotations.procesors;

import homework_9.Ani_Barseghyan.annotations.Email;
import homework_9.Ani_Barseghyan.error.Error;

import java.lang.reflect.Field;

public class EmailAnnotationProcess {

    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);

        if (o instanceof String customerEmail) {
            Email annotation = field.getAnnotation(Email.class);
            if (customerEmail.matches(annotation.regex())) {
                return new Error("The email does not meet the requirements", field.getName());
            } else return new Error("Wrong usage error", field.getName());
        }
        System.out.println("Validation is passed for " + field.getName());
        return null;
    }
}
