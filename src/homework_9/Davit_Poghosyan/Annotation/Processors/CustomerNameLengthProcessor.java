package homework_9.Davit_Poghosyan.Annotation.Processors;


import homework_9.Davit_Poghosyan.Annotation.Length;
import homework_9.Davit_Poghosyan.Dto.CustomerDto;

import java.lang.reflect.Field;

public class CustomerNameLengthProcessor {
    public static Error checkNameIsValid(Field field, CustomerDto customer) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof String){
        Length length = field.getAnnotation(Length.class);
        if (customer.getName().length() < length.min() || customer.getName().length() > length.max()) {
            return new Error(length.message());
        } else {
            System.out.println("Customer name is valid");
        }

    }return new Error();
    }
}
