package homework_9.TatevKocharyan.chapter12.annotationsHomework;

import homework_9.TatevKocharyan.chapter12.annotationsHomework.annotations.*;
import homework_9.TatevKocharyan.chapter12.annotationsHomework.annotations.processors.*;
import homework_9.TatevKocharyan.chapter12.annotationsHomework.error.ErrorStorage;

import java.lang.reflect.Field;

public class Validator {


    ErrorStorage errorStorage = new ErrorStorage();

    public ErrorStorage validate(CustomerDto customer) throws IllegalAccessException {
        Field[] declaredFields = customer.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {
                AdulthoodAnnotationProcessor adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor();
                errorStorage.addError(adulthoodAnnotationProcessor.processAnnotation(customer, field));
            }
            if (field.isAnnotationPresent(Length.class)) {
                LenghtAnnotationProcessor lenghtAnnotationProcessor = new LenghtAnnotationProcessor();
                errorStorage.addError(lenghtAnnotationProcessor.processAnnotation(customer, field));
            }
            if (field.isAnnotationPresent(Max.class)) {
                MaxAnnotationProcessor maxAnnotationProcessor = new MaxAnnotationProcessor();
                errorStorage.addError(maxAnnotationProcessor.processAnnotation(customer, field));
            }
            if (field.isAnnotationPresent(Min.class)) {
                MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();
                errorStorage.addError(minAnnotationProcessor.processAnnotation(customer, field));
            }
            if (field.isAnnotationPresent(Min.class)) {
                MinAnnotationProcessor minAnnotationProcessor = new MinAnnotationProcessor();
                errorStorage.addError(minAnnotationProcessor.processAnnotation(customer, field));
            }
            if (field.isAnnotationPresent(Email.class)) {
                EmailAnnotationProcessor emailAnnotationProcessor = new EmailAnnotationProcessor();
                errorStorage.addError(emailAnnotationProcessor.processAnnotation(customer, field));
            }

        }
        return errorStorage;
    }
}


