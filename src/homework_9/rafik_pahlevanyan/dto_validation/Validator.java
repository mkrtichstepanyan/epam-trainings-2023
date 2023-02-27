package homework_9.rafik_pahlevanyan.dto_validation;

import homework_9.rafik_pahlevanyan.dto_validation.annotations.*;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Validator {
    public static List<String> validate(Object dto) {
        List<String> errors = new ArrayList<>();
        Class<?> clazz = dto.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            Object value;
            try {
                value = field.get(dto);
            } catch (IllegalAccessException e) {
                // Ignore fields that can't be accessed
                continue;
            }
            // Check Length annotation
            Length length = field.getAnnotation(Length.class);
            if (length != null && value != null) {
                int len = value.toString().length();
                if (len < length.min() || len > length.max()) {
                    errors.add(field.getName() + " length should be between " + length.min() + " and " + length.max());
                }
            }
            // Check Email annotation
            Email email = field.getAnnotation(Email.class);
            if (email != null && value != null) {
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
                if (!pattern.matcher(value.toString()).matches()) {
                    errors.add(field.getName() + " should be a valid email address");
                }
            }
            // Check Adulthood annotation
            Adulthood adulthood = field.getAnnotation(Adulthood.class);
            if (adulthood != null && value instanceof LocalDate) {
                LocalDate dob = (LocalDate) value;
                LocalDate now = LocalDate.now();
                int age = Period.between(dob, now).getYears();
                if (age < 18) {
                    errors.add(field.getName() + " should be at least 18 years old");
                }
            }

            // Check Min annotation
            Min min = field.getAnnotation(Min.class);
            if (min != null && value instanceof Number) {
                double num = ((Number) value).doubleValue();
                if (num < min.value()) {
                    errors.add(field.getName() + " should not be less than " + min.value());
                }
            }
            // Check Max annotation
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