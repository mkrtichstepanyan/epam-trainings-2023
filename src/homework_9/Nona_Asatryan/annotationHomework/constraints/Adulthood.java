package homework_9.Nona_Asatryan.annotationHomework.constraints;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
public @interface Adulthood {

    String message() default "You are under the age of majority!";
    int age() default 18;
}
