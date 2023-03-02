package Hovhannes_Abrahamyan.DTO_validation.proccessor;

import DTO_validation.annotations.Length;
import DTO_validation.exceptions.AnnotationIncorrectUsageException;

import java.lang.reflect.Field;

public class LengthAnnotationProcessor {

    public String[] lengthAnnotationMeth(Object dto) throws IllegalAccessException {
        Field[] fields = dto.getClass().getDeclaredFields();
        String[] errors = new String [0];
        for (Field field : fields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                Object obj = field.get(dto);
                if (obj instanceof String) {
                    String fieldValue = (String) obj;
                    int length = fieldValue.length();
                    Length annotation = field.getAnnotation(Length.class);
                    int minLength = annotation.minvalue();
                    int maxLength = annotation.maxvalue();
                    if (length < minLength || length > maxLength) {
                        errors = new String[1];
                        errors[0] = annotation.nameErrorMessage();
                    } else {
                        throw new AnnotationIncorrectUsageException("Length annotation is can not  be used " + field.getType() + "fields");
                    }
                }
            }
        }
        return errors;
    }
}