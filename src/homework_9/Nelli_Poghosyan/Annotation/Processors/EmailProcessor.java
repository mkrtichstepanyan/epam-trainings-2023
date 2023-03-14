package homework_9.Nelli_Poghosyan.Annotation.Processors;

import homework_9.Nelli_Poghosyan.Annotation.Email;
import homework_9.Nelli_Poghosyan.Dto.CustomerDto;

import java.lang.reflect.Field;

public class EmailProcessor {
    public static Error checkEmailIsValid(Field field, CustomerDto customer) throws IllegalAccessException {
        Email email = field.getAnnotation(Email.class);
        if (customer.getEmail().matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+" +
                "@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?" +
                "(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$\n")) {
            System.out.println("Email is valid");
        } else {
            return new Error(email.message());
        }
        return new Error("Wrong usage "+field.getName());
    }
}
