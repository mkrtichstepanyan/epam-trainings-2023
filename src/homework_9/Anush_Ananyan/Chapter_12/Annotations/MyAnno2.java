package homework_9.Anush_Ananyan.Chapter_12.Annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno2 {
    String str() default "Testing";

    int val() default 1000;
}
