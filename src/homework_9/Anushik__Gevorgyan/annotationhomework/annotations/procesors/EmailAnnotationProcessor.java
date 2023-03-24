package homework_9.Anushik__Gevorgyan.annotationhomework.annotations.procesors;



import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.Email;
import homework_9.Anushik__Gevorgyan.annotationhomework.error.Error;

import java.lang.reflect.Field;


public class EmailAnnotationProcessor {

    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);

        if (o instanceof String email) {
            Email annotation=field.getAnnotation(Email.class);
            String regex=annotation.emailRegex();
            if(!email.matches(regex)) {

                return new Error("Incorrect email address!", field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        System.out.println("Validation process has successfully passed " + field.getName());
        return null;
    }
}
