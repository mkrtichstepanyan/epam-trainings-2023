package homework_9.Nelli_Poghosyan.Annotation.Processors;

import homework_9.Nelli_Poghosyan.Annotation.Length;
import homework_9.Nelli_Poghosyan.Annotation.Max;
import homework_9.Nelli_Poghosyan.Annotation.Min;
import homework_9.Nelli_Poghosyan.Dto.CustomerDto;
import homework_9.Nelli_Poghosyan.Validation.Error;

import java.lang.reflect.Field;

public class DiscountRateProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        // pattern matching
        if (o instanceof Integer discount) {
            Min annotation = field.getAnnotation(Min.class);
            Max annotation1 = field.getAnnotation(Max.class);
            if (discount < annotation.value()) {
                return new Error(annotation.message(), field.getName());
            }
            else if(discount > annotation1.value()){
                return new Error(annotation1.message(), field.getName());
            }
        } else {
            return new Error("Wrong usage error", field.getName());
        }
        return null;
    }
}
