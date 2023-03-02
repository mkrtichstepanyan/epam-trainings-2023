package homework_9.araksya.ghazaryan.DTO;

import homework_9.araksya.ghazaryan.DTO.Annotations. *;
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
                continue;
            }
            Lenght length = field.getAnnotation(Lenght.class);
            if (length != null && value != null) {
                int len = value.toString().length();
                if (len < length.min() || len > length.max()) {
                    errors.add(field.getName() + " length should be between 2 and 30 ") ;
                }
            }
            Email email = field.getAnnotation(Email.class);
            if (email != null && value != null) {
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:" +
                        "[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
                if (!pattern.matcher(value.toString()).matches()) {
                    errors.add(field.getName() + " should be a valid email address");
                }
            }
            Adulthood adulthood = field.getAnnotation(Adulthood.class);
            if (adulthood != null && value instanceof LocalDate) {
                LocalDate day = (LocalDate) value;
                LocalDate now = LocalDate.now();
                int age = Period.between(day, now).getYears();
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
                    errors.add(field.getName() + " should not exceed 100");
                }
            }
        }
        return errors;
    }
}