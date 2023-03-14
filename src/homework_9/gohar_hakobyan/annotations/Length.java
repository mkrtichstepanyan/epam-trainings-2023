package homework_9.gohar_hakobyan.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
public @interface Length {
    String message() default "{validation.constraints.Size.message}";

    int min() default 0;
    int max() default Integer.MAX_VALUE;


}
