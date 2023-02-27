package homework_9.assignment.hovhannes_gspeyan.validation;

import homework_9.assignment.hovhannes_gspeyan.constraint.*;
import homework_9.assignment.hovhannes_gspeyan.model.CustomerDto;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class Validator {

    public static String[] validate(CustomerDto dto) throws IllegalAccessException {
        Field[] fields = dto.getClass().getDeclaredFields();
        String[] errors = new String[fields.length];
        int i = 0;
        for (Field field : fields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Length lengthAnnotation = field.getAnnotation(Length.class);
                int minLength = lengthAnnotation.min();
                int maxLength = lengthAnnotation.max();

                String value = (String) field.get(dto);
                int length = value.length();
                if (length < minLength || length > maxLength) {
                    errors[i++] = lengthAnnotation.message();
                }
            } else if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                Email emailAnnotation = field.getAnnotation(Email.class);
                String regex = emailAnnotation.regex();
                String value = (String) field.get(dto);
                if (value != null && !value.matches(regex)) {
                    errors[i++] = emailAnnotation.message();
                }
            } else if (field.isAnnotationPresent(Adulthood.class)) {
                field.setAccessible(true);
                Adulthood adulthoodAnno = field.getAnnotation(Adulthood.class);
                int adultAge = adulthoodAnno.adultAge();
                LocalDate birthday = dto.getBirthday();
                LocalDate now = LocalDate.now();
                int age = Period.between(birthday, now).getYears();
                if (age < adultAge) {
                    errors[i++] = adulthoodAnno.message();
                }
            } else if (field.isAnnotationPresent(Min.class) && field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Min minAnno = field.getAnnotation(Min.class);
                Max maxAnno = field.getAnnotation(Max.class);
                double min = minAnno.minValue();
                double max = maxAnno.maxValue();
                double value = (double) field.get(dto);
                if (value < min) {
                    errors[i++] = minAnno.message();
                } else if (value > max) {
                    errors[i++] = maxAnno.message();
                }
            }
        }
        return errors;
    }
}

