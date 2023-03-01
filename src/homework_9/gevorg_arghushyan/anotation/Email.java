package homework_9.gevorg_arghushyan.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {

}
