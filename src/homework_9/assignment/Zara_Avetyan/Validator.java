package homework_9.assignment.Zara_Avetyan;

import java.lang.reflect.*;

import homework_9.assignment.Zara_Avetyan.processors.AdulthoodAnnotationProcess;
import homework_9.assignment.Zara_Avetyan.processors.DiscountRateAnnotationProcess;
import homework_9.assignment.Zara_Avetyan.processors.EmailAnnotationProcess;
import homework_9.assignment.Zara_Avetyan.processors.NameAnnotationProcess;

public class Validator {
    public Validator(Object customer) throws IllegalAccessException {
        for (Field field : customer.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Length.class)) {
                if (NameAnnotationProcess.Validator(customer, field)) {
                    Errors.Error(field.getName());
                }
            }
            if (field.isAnnotationPresent(Email.class)) {
                if (EmailAnnotationProcess.Validator(customer, field)) {
                    Errors.Error(field.getName());
                }
            }

            if (field.isAnnotationPresent(Adulthood.class)) {
                if (AdulthoodAnnotationProcess.Validator(customer, field)) {
                    Errors.Error(field.getName());
                }
            }
            if (field.isAnnotationPresent(Min.class) && field.isAnnotationPresent(Max.class)) {
                if (DiscountRateAnnotationProcess.Validator(customer, field)) {
                    Errors.Error(field.getName());
                }
            }
        }

    }
}