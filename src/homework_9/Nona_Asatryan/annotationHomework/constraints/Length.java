package homework_9.Nona_Asatryan.annotationHomework.constraints;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
public @interface Length {

    int min() default 0;
    int max() default Integer.MAX_VALUE;
    String message() default "Your name's length is out of range!";
}
