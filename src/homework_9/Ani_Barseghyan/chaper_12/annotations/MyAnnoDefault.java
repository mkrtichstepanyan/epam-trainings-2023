package homework_9.Ani_Barseghyan.chaper_12.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnoDefault {
    String str() default "Testing";

    int val() default 9000;
}
