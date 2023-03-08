package homework_9.Sofya_Ghazaryan.annotations_task.validator;

import homework_9.Sofya_Ghazaryan.annotations_task.annotations.*;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Validator {
    public static List<String> validate(Object obj) {
        List<String> errors = new ArrayList<>();
        Class<?> aClass = obj.getClass();
        for (Field field : aClass.getDeclaredFields()) {
            field.setAccessible(true);
            Object value;
            try {
                value = field.get(obj);
            } catch (IllegalAccessException e) {
                continue;
            }
            Length length = field.getAnnotation(Length.class);
            if (length != null && value != null) {
                int len = value.toString().length();
                if (len < length.min() || len > length.max()) {
                    errors.add(field.getName() + " Length should be between " + length.min() + " and " + length.max());
                }
            }
            Email email = field.getAnnotation(Email.class);
            if (email != null && value != null) {
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+" +
                        "@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\." +
                        "[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
                if (!pattern.matcher(value.toString()).matches()) {
                    errors.add(field.getName() + " Should be a correct email address");
                }
            }
            Adulthood adulthood = field.getAnnotation(Adulthood.class);
            if (adulthood != null && value instanceof LocalDate) {
                LocalDate dob = (LocalDate) value;
                LocalDate now = LocalDate.now();
                int age = Period.between(dob, now).getYears();
                if (age < 18) {
                    errors.add(field.getName() + " should be at least 18 years old");
                }
            }

            Min min = field.getAnnotation(Min.class);
            if (min != null && value instanceof Number) {
                double num = ((Number) value).doubleValue();
                if (num < min.value()) {
                    errors.add(field.getName() + " should not be less than " + min.value());
                }
            }
            Max max = field.getAnnotation(Max.class);
            if (max != null && value instanceof Number) {
                double num = ((Number) value).doubleValue();
                if (num > max.value()) {
                    errors.add(field.getName() + " should not exceed " + max.value());
                }
            }
        }
        return errors;
    }
}