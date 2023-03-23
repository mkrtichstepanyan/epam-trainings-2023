package homework_9.Eduard_Eghiazaryan.chaper_12.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnotation.class)
public @interface MyAnnoRepeatable {
    String str() default "Testing";

    int val() default 9000;
}
