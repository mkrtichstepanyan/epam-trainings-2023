package homework_9.Yeghia_Ansuryan.Chapter_12.Annotation.Single;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value();
}
