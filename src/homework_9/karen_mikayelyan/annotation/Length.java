package homework_9.karen_mikayelyan.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Length {
    int min();

    int max();

    String message() default "Customer name can not be less" +
            "than 2 and more than 30 characters";
}
