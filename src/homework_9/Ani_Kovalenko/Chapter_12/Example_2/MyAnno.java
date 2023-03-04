package homework_9.Ani_Kovalenko.Chapter_12.Example_2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();

    int val();
}
