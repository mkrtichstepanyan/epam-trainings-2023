package homework_9.Varsik_Pijoyan.AnnotationHomework.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Email {
    String emailRegex() default "*+/=?^_`(|)~-]+@[a-zA-ZO-9](?:[a-zA-ZO-9-]" +
            "{0,61}[a-zA-ZO-9])?(?:\\.[a-zA-ZO-9](?:[a-zA-ZO-9-]{0,61}[a-zA-ZO-9])?)*$";
}
