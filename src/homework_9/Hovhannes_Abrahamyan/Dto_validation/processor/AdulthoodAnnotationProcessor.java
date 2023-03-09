package Hovhannes_Abrahamyan.DTO_validation.proccessor;

import DTO_validation.annotations.Adulthood;
import DTO_validation.exceptions.AnnotationIncorrectUsageException;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {

    public String[] adulthoodAnnotationMeth(Object dto) throws NoSuchFieldException, IllegalAccessException {
        Field[] fields = dto.getClass().getDeclaredFields();
        String[] errors = new String[0];
        for (Field field : fields) {
            if (field.isAnnotationPresent(Adulthood.class)) {
                Adulthood annotation = field.getAnnotation(Adulthood.class);
                field.setAccessible(true);
                if (field.get(dto) instanceof LocalDate) {
                    LocalDate obj = (LocalDate) field.get(dto);
                    Period period = Period.between(obj, LocalDate.now());
                    int years = period.getYears();
                    if (years < 18) {
                        errors = new String[1];
                        errors[0] = annotation.adulthoodErrorMessage();
                    }
                } else {
                    throw new AnnotationIncorrectUsageException("Adulthood annotation can not be used on " + field.getType() + " field.");
                }
            }
        }
        return errors;
    }
}