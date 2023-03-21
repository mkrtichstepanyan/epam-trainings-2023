package homework_9.Eduard_Eghiazaryan.chaper_12.annotations.type_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_PARAMETER)
public @interface What {
    String description();
}
