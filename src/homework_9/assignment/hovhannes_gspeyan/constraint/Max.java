package homework_9.assignment.hovhannes_gspeyan.constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
public @interface Max {

    double maxValue() default Double.MAX_VALUE;
    String message() default "Value is greater than the maximum";
}
