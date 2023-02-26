package homework_9.assignment.Ani_Barseghyan.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

public @interface Length {

    int min() default 2;

    int max() default 30;

    String warningMessage() default "Customer name should have range of 2-30";
}
