package Hovhannes_Abrahamyan.DTO_validation.proccessor;

import DTO_validation.annotations.Email;
import DTO_validation.exceptions.AnnotationIncorrectUsageException;

import java.lang.reflect.Field;

public class EmailAnnotationProcessor {

    public static final String EMAIL_REGEX = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    public String[] emailAnnotationMeth(Object dto) throws NoSuchFieldException, IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        String[] errors = new String[0];
        for (Field filed : declaredFields) {
            if (filed.isAnnotationPresent(Email.class)) {
                Email annotation = filed.getAnnotation(Email.class);
                filed.setAccessible(true);
                if (filed.get(dto) instanceof String) {
                    String fieldValue = (String) filed.get(dto);
                    int length = fieldValue.length();
                    if (length != 0) {
                        if (!fieldValue.matches(EMAIL_REGEX)) {
                            errors = new String[1];
                            errors[0] = annotation.emailErrorMassage();
                        }
                    }
                } else {
                    throw new AnnotationIncorrectUsageException("Email annotation is can not  be usd" + filed.getType() + "field");
                }
            }
        }
        return errors;
    }
}