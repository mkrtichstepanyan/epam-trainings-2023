package homework_9.Ani_Kovalenko.Chapter_12.Example_4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str() default "Testing";

    int val() default 9000;
}
