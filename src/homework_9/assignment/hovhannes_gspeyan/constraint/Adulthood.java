package homework_9.assignment.hovhannes_gspeyan.constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
public @interface Adulthood {

    String message() default "You are under the age of majority";

    int adultAge() default 18;
}
