package homework_9.Anush_Ananyan.Chapter_12.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value();
}
