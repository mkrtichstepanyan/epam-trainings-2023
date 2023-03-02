package homework_9.Alina_Mkhoyan.assignment;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator<T> {

    public List<?> validate(T object) throws IllegalAccessException {
        List<String> list = new ArrayList<>();
        Class<?> objectClass = object.getClass();

        Field[] fields = objectClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object fieldValue = field.get(object);
            if (field.isAnnotationPresent(Length.class)) {
                String currentValue = (String) fieldValue;
                if (currentValue.length() <= field.getAnnotation(Length.class).min() || currentValue.length() >=
                        field.getAnnotation(Length.class).max() || currentValue == "") {
                    list.add("1. Name does not require the given length." + "\n");
                }
            } else if (field.isAnnotationPresent(Adulthood.class)) {
                int currentYear = LocalDate.now().getYear();
                int currentAge = currentYear - ((LocalDate) fieldValue).getYear();
                if (currentAge < field.getAnnotation(Adulthood.class).age()) {
                    list.add("3. Age hasn't reached adulthood age yet." + "\n");
                }

            } else if (field.isAnnotationPresent(Min.class) && field.isAnnotationPresent(Max.class)) {
                Integer currentValue = (Integer) fieldValue;
                if (currentValue <= field.getAnnotation(Min.class).value() || currentValue >= field.getAnnotation(Max.class).value()) {
                    list.add("4. Discount rate cannot be less than 0 or more than 100." + "\n");
                }

            } else if (field.isAnnotationPresent(Email.class)) {
                CharSequence currentEmail = (CharSequence) fieldValue;
                String REGEX = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?" +
                        "(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
                Pattern pattern = Pattern.compile(REGEX);
                Matcher matcher = pattern.matcher(currentEmail);
                if (!matcher.matches()) {
                    list.add("2. Email is not valid." + "\n");
                }
            }
        }
        return list;
    }
}