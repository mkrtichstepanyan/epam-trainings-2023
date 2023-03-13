package homework_9.Vladimir_Vanyan.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface Length {
    int min() default 2;

    int max() default 30;
}
