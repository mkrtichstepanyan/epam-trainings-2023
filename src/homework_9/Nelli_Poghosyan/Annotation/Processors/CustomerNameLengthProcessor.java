package homework_9.Nelli_Poghosyan.Annotation.Processors;

import homework_9.Nelli_Poghosyan.Annotation.Length;
import homework_9.Nelli_Poghosyan.Dto.CustomerDto;

import java.lang.reflect.Field;

public class CustomerNameLengthProcessor {
    public static Error checkNameIsValid(Field field, CustomerDto customer) throws IllegalAccessException {
        Object o = field.get(customer);
        Length length = field.getAnnotation(Length.class);
        if (customer.getName().length() < length.min() || customer.getName().length() > length.max()) {
            return new Error(length.message());
        } else {
            System.out.println("Customer name is valid");
        }
        return new Error("Wrong usage "+field.getName());
    }
}
