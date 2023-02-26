package homework_9.rafik_pahlevanyan.chapter_12;

//A simple annotation type

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//An annotation type declaration
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
public @interface MyAnno {
    String str() default "Testing";

    int val() default 9000;
}
