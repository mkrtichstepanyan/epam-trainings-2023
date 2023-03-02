package homework_9.Qnarik_Khachatryan.tasks;

import homework_9.Qnarik_Khachatryan.tasks.annotations.Adulthood;
import homework_9.Qnarik_Khachatryan.tasks.annotations.Email;
import homework_9.Qnarik_Khachatryan.tasks.annotations.Length;
import homework_9.Qnarik_Khachatryan.tasks.annotations.Min;
import homework_9.Qnarik_Khachatryan.tasks.annotations.Max;
import homework_9.Qnarik_Khachatryan.tasks.annotations.processors.*;
import homework_9.Qnarik_Khachatryan.tasks.error.Errors;

import java.lang.reflect.Field;


class CustomerValidator implements Validator {

    private Errors errors = new Errors();

    public Errors validate(Object obj) throws IllegalAccessException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(AdulthoodAnnotationProcessor.processAnnotation(obj, field));
            }
            if (field.isAnnotationPresent(Email.class)) {
                errors.addError(EmailAnnotationProcessor.processAnnotation(obj, field));
            }
            if (field.isAnnotationPresent(Length.class)) {
                errors.addError(LengthAnnotationProcessor.processAnnotation(obj, field));
            }
            if (field.isAnnotationPresent(Min.class)) {
                errors.addError(MinAnnotationProcessor.processAnnotation(obj, field));
            }
            if (field.isAnnotationPresent(Max.class)) {
                errors.addError(MaxAnnotationProcessor.processAnnotation(obj, field));
            }
        }
        return errors;
    }
}


