package homework_9.Anush_Ananyan.Chapter_12.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnoDefault {
    String str () default "Testing";
    int val()default 1000;
}
