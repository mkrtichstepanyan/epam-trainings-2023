package homework_9.Qnarik_Khachatryan.chapter_12.Annotations;

//An annotation that can be applied to a method declaration.

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface Recommended {
}
