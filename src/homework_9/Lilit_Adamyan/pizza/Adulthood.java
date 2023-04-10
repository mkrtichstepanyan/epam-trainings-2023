package homework_9.Lilit_Adamyan.pizza;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Adulthood {


}
