package homework_9.araksya.ghazaryan.chapter_12;


import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//@Repeatable(MyRepeatedAnnos.class)
public @interface MyAnno {
    String str() default "Testing";
    int val() default 9000;
}
