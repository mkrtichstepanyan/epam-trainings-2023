package homework_9.Nona_Asatryan.annotationHomework.constraints;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
public @interface Min {

    double minValue() default Double.MIN_VALUE;
    String message() default "Provided value is less than the min value!";
}
