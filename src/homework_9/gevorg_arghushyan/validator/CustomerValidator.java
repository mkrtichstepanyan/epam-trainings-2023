package homework_9.gevorg_arghushyan.validator;

import gevorg_arghushyan.anotation.*;
import gevorg_arghushyan.dto.CustomerDto;
import gevorg_arghushyan.error.Errors;
import gevorg_arghushyan.processor.*;

import java.lang.reflect.Field;

public class CustomerValidator implements Validator {
    private Errors errors = new Errors();

    @Override
    public Errors validate(Object obj) throws IllegalAccessException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();

        CustomerDto customer = (CustomerDto) obj;

        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(AdulthoodAnnotationProcessor.processAnnotation(obj, field));
            }
            if (field.isAnnotationPresent(Length.class)) {
                errors.addError(LengthAnnotationProcessor.processorLengthAnnotation(customer));
            }
            if (field.isAnnotationPresent(Email.class)) {
                errors.addError(EmailProcessor.processorEmailAnnotation(customer));
            }
            if (field.isAnnotationPresent(Max.class)) {
                errors.addError(MaxProcessor.maxAnnotation(customer));
            }
            if (field.isAnnotationPresent(Min.class)) {
                errors.addError(MinProcessor.minAnnotation(customer));
            }
        }
        return errors;
    }
}
