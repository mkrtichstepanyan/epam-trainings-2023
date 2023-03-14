package homework_9.Ani_Barseghyan.chaper_12.annotations;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();
    int val();
}
