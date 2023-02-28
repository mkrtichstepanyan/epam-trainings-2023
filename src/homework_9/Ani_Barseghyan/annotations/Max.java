package homework_9.Ani_Barseghyan.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Max {
    int value();

    String warningMessage() default "Discount rate can not be more than 100";
}
