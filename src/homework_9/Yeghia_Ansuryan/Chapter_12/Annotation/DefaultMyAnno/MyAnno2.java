package homework_9.Yeghia_Ansuryan.Chapter_12.Annotation.DefaultMyAnno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno2 {
    String str() default "Teseing";
    int val () default  9000;
}
