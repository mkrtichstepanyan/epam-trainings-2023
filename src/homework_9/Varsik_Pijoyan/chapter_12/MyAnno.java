package homework_9.Varsik_Pijoyan.chapter_12;

import java.lang.annotation.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str() default "Testing";
    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String description();
}


