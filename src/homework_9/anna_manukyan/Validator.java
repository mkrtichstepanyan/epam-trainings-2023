package homework_9.anna_manukyan;

import homework_9.anna_manukyan.myAnnotations.Adulthood;
import homework_9.anna_manukyan.myAnnotations.Email;
import homework_9.anna_manukyan.myAnnotations.Length;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    static List<String> errors = new ArrayList<>();

    public static List<String> validate(Object dto) throws IllegalAccessException {
        if (dto instanceof CustomerDTO) {
            for (Field field : dto.getClass().getDeclaredFields()) {
                field.setAccessible(true);

                if (field.getAnnotation(Length.class) != null) {
                    String name = (String) field.get(dto);
                    Length annotation = field.getAnnotation(Length.class);
                    int max = annotation.max();
                    int min = annotation.min();
                    if (name.length() < min || name.length() > max) {
                        errors.add("Name of Customer " + name +
                                " must have min " + min + " and max " + max + "length");
                    }
                }
                if (field.getAnnotation(Email.class) != null) {
                }


                if (field.getAnnotation(Adulthood.class) != null) {
                    int age = (int) (field.get(dto));
                    Adulthood ageAnnotation = field.getAnnotation(Adulthood.class);
                    int value = ageAnnotation.value();
                    if (value < age) {
                        errors.add("Customer " + field.getName() +
                                " must not be less then " + value + " age ");
                    }

                }
            }

        }
        return errors;
    }
}
