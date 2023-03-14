package homework_9.Roza_Petrosyan.chapter_12.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str() default "Test";
    int value() default 9000;
}
