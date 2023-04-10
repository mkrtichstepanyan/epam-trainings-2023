package classwork.annotationexample;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE_USE})
@Inherited
public @interface CustomerTypeAnnotation {
    int value() default 1000;
}
