package homework_9.Lilit_Adamyan.pizza;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;

public class Validator {
    private static void checkLength(Field field, Object dto, ArrayList<String> errors) {
        Length length = field.getAnnotation(Length.class);
        try {
            field.setAccessible(true);
            String value = (String) field.get(dto);
            if (value != null && (value.length() < length.min() || value.length() > length.max())) {
                errors.add("Invalid length for field " + field.getName());
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void checkEmail(Field field, Object dto, ArrayList<String> errors) {
        Email email = field.getAnnotation(Email.class);

        try {
            field.setAccessible(true);
            String value = (String) field.get(dto);
            if (value != null && !value.matches(email.regex())) {
                errors.add("Invalid email format for field " + field.getName());
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void checkAdultHood(Field field, Object dto, ArrayList<String> errors) {
        Adulthood adulthood = field.getAnnotation(Adulthood.class);
        try {
            field.setAccessible(true);
            LocalDate value = (LocalDate) field.get(dto);
            LocalDate adulthoodAge = LocalDate.now().minusYears(18);
            if (value != null && value.isAfter(adulthoodAge)) {
                errors.add("Customer is not of legal age for field " + field.getName());
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void checkMin(Field field, Object dto, ArrayList<String> errors) {
        Min min = field.getAnnotation(Min.class);
        try {
            field.setAccessible(true);
            int value = (int) field.get(dto);
            if (value < min.value()) {
                errors.add("Value is less than minimum for field " + field.getName());
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void checkMax(Field field, Object dto, ArrayList<String> errors) {
        Max max = field.getAnnotation(Max.class);
        try {
            field.setAccessible(true);
            int value = (int) field.get(dto);
            if (value > max.value()) {
                errors.add("Value is less than minimum for field " + field.getName());
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static String[]validate(CustomerDTO dto) throws RuntimeException {
        ArrayList<String> errors = new ArrayList<>();
        Field[] fields = dto.getClass().getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType() == Length.class) {
                    checkLength(field, dto, errors);
                } else if (annotation.annotationType() == Email.class) {
                    checkEmail(field, dto, errors);
                } else if (annotation.annotationType() == Adulthood.class) {
                    checkAdultHood(field, dto, errors);
                } else if (annotation.annotationType() == Min.class) {
                    checkMin(field, dto, errors);
                } else if (annotation.annotationType() == Max.class) {
                    checkMax(field, dto, errors);
                }else{
                    throw new RuntimeException("Unexpected annotation type: " + annotation.annotationType().getSimpleName());
                }

            }

        }
        return errors.toArray(new String[errors.size()]);
    }
}
