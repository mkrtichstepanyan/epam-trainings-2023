package homework_9.assignment.Zara_Avetyan.Homework;

import java.lang.reflect.*;

import homework_9.assignment.Zara_Avetyan.Homework.processors.AdulthoodAnnotationProcess;
import homework_9.assignment.Zara_Avetyan.Homework.processors.DiscountRateAnnotationProcess;
import homework_9.assignment.Zara_Avetyan.Homework.processors.EmailAnnotationProcess;
import homework_9.assignment.Zara_Avetyan.Homework.processors.NameAnnotationProcess;

public class Validator {
    Validator(Object customer) throws IllegalAccessException {
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