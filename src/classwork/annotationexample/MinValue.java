package classwork.annotationexample;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
public @interface MinValue {
    int value () default 1000;
}
