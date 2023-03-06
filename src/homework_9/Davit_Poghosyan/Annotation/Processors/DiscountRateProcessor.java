package homework_9.Davit_Poghosyan.Annotation.Processors;

import homework_9.Nelli_Poghosyan.Annotation.Max;
import homework_9.Nelli_Poghosyan.Annotation.Min;
import homework_9.Nelli_Poghosyan.Dto.CustomerDto;

import java.lang.reflect.Field;

public class DiscountRateProcessor {
    public static Error checkDiscountRate(Field field, CustomerDto customer) throws IllegalAccessException {
        Max maxValue = field.getAnnotation(Max.class);
        Min minValue = field.getAnnotation(Min.class);
        if (customer.getDiscountRate() < minValue.value()) {
            return new Error(minValue.message());
        }
        if (customer.getDiscountRate() > maxValue.value()) {
            return new Error(maxValue.message());
        }
        return new Error("Wrong usage "+field.getName());
    }
}
