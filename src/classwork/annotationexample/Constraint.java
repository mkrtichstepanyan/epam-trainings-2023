package classwork.annotationexample;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
@Repeatable(value = Constraints.class)
public @interface Constraint {

    int value() default 0;
}
