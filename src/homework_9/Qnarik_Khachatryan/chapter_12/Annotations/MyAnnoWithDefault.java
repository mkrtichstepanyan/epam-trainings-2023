package homework_9.Qnarik_Khachatryan.chapter_12.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//An annotation type declaration that includes defaults
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoWithDefault {
    String str() default "Testing";

    int val() default 9000;
}
