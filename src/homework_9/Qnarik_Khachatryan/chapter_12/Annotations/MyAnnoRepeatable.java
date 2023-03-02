package homework_9.Qnarik_Khachatryan.chapter_12.Annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnnoRepeatable {
    String str() default "Testing";

    int val() default 9000;
}
