package homework_9.Qnarik_Khachatryan.chapter_12.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//An annotation that can be applied to a type parameter.
@Target(ElementType.TYPE_PARAMETER)
@interface What2 {
    String description();
}
