package homework_9.Ani_Barseghyan.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Adulthood {
    int age() default 18;
    String warningMessage() default "Customer should be adult";
}
