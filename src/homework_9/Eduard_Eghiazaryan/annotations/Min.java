package homework_9.Eduard_Eghiazaryan.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Min {
    int value();
}
