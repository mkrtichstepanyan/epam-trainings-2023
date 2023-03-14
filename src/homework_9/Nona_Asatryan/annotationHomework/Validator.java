package homework_9.Nona_Asatryan.annotationHomework;

import homework_9.Nona_Asatryan.annotationHomework.constraints.*;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class Validator {
    public static String[] validate(CustomerDto dto) throws IllegalAccessException {
        Field[] fields = dto.getClass().getDeclaredFields();
        String[] errors = new String[fields.length];
        int index = 0;
        for (Field field : fields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Length lengthAnnotation = field.getAnnotation(Length.class);
                int minLength = lengthAnnotation.min();
                int maxLength = lengthAnnotation.max();

                String value = (String) field.get(dto);
                int length = value.length();
                if (length < minLength || length > maxLength) {
                    errors[index++] = lengthAnnotation.message();
                }
            } else if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);
                Email emailAnnotation = field.getAnnotation(Email.class);
                String regex = emailAnnotation.regex();
                String value = (String) field.get(dto);
                if (value != null && !value.matches(regex)) {
                    errors[index++] = emailAnnotation.message();
                }
            } else if (field.isAnnotationPresent(Adulthood.class)) {
                field.setAccessible(true);
                Adulthood adulthood = field.getAnnotation(Adulthood.class);
                int adultAge = adulthood.age();
                LocalDate birthday = dto.getBirthdate();
                LocalDate now = LocalDate.now();
                int age = Period.between(birthday, now).getYears();
                if (age < adultAge) {
                    errors[index++] = adulthood.message();
                }
            } else if (field.isAnnotationPresent(Min.class) && field.isAnnotationPresent(Max.class)) {
                field.setAccessible(true);
                Min minAnno = field.getAnnotation(Min.class);
                Max maxAnno = field.getAnnotation(Max.class);
                double min = minAnno.minValue();
                double max = maxAnno.maxValue();
                double value = (double) field.get(dto);
                if (value < min) {
                    errors[index++] = minAnno.message();
                } else if (value > max) {
                    errors[index++] = maxAnno.message();
                }
            }
        }
        return errors;
    }
}
