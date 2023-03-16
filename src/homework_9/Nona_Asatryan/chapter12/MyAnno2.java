package homework_9.Nona_Asatryan.chapter12;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
public @interface MyAnno2 {
    String str() default "Testing";
    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}




