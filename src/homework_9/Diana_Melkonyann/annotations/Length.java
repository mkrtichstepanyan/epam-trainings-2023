package homework_9.Diana_Melkonyann.annotations;


import homework_1.Gohar_Hakobyan.Double;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Length {
    int min();

    int max();
}
