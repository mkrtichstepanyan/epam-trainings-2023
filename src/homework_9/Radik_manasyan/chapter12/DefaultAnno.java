package homework_9.Radik_manasyan.chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultAnno {
    String str() default "Тестирование";

    int val() default 9000;
}
