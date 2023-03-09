package Hovhannes_Abrahamyan.DTO_validation;

import DTO_validation.*;
import DTO_validation.processor.*;

public class Validator {

    private LengthAnnotationProcessor lengthAnnotationProcessor = new LengthAnnotationProcessor();
    private EmailAnnotationProcessor emailAnnotationProcessor = new EmailAnnotationProcessor();
    private AdulthoodAnnotationProcessor adulthoodAnnotationProcessor = new AdulthoodAnnotationProcessor();
    private MaxAnnotationProcessor max_annotationProcessor = new MaxAnnotationProcessor();
    private MinAnnotationprocessor min_Annotationprocessor = new MinAnnotationprocessor();

    public String[] validateMeth(Object dto) throws NoSuchFieldException, IllegalAccessException {
        String[] errors = new String[0];

        String[] lengthValidationErrors = lengthAnnotationProcessor.lengthAnnotationMeth(dto);
        errors = appendErrors(errors, lengthValidationErrors);
        String[] emailValidationErrors = emailAnnotationProcessor.emailAnnotationMeth(dto);
        errors = appendErrors(errors, emailValidationErrors);
        String[] adulthoodValidationErrors = adulthoodAnnotationProcessor.adulthoodAnnotationMeth(dto);
        errors = appendErrors(errors, adulthoodValidationErrors);
        String[] maxValidationErrors = max_annotationProcessor.maxAnnotationMeth(dto);
        errors = appendErrors(errors, maxValidationErrors);
        String [] minValidationErrors = min_Annotationprocessor.minAnnotationMeth(dto);

        return errors;
    }

    private String[] appendErrors(String[] initialErrors, String[] newErrors) {
        int size = initialErrors.length + newErrors.length;
        String[] appendErrors = new String[size];
        System.arraycopy(initialErrors, 0, appendErrors, 0, initialErrors.length);
        System.arraycopy(newErrors, 0, appendErrors, appendErrors.length - 1, newErrors.length);

        return appendErrors;
    }
}