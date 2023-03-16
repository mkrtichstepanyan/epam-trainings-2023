package homework_9.Nelli_Poghosyan.Annotation.Processors;

import homework_9.Nelli_Poghosyan.Annotation.Email;
import homework_9.Nelli_Poghosyan.Annotation.Length;
import homework_9.Nelli_Poghosyan.Dto.CustomerDto;
import homework_9.Nelli_Poghosyan.Validation.Error;

import java.lang.reflect.Field;

public class EmailProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        // pattern matching
        if (o instanceof String email) {
            Email annotation = field.getAnnotation(Email.class);
            if (email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+" +
                    "@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?" +
                    "(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$\n")) {
                System.out.println("Email is valid");
            } else {
                return new Error(annotation.message(), field.getName());
            }
        }
        else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}
