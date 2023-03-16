package homework_9.Nelli_Poghosyan.Annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

public @interface Max {
    int value() default 100;
    String message() default "The discount rate can't be more than 100%";
}
