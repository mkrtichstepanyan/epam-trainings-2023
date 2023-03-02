package Hovhannes_Abrahamyan.DTO_validation.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Email {
    String emailErrorMassage();

}