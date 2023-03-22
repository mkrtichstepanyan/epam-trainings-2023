package homework_9.Anush_Ananyan.Chapter_12.Annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepeatedAnnos {
    MyAnno2 [] value();
}
