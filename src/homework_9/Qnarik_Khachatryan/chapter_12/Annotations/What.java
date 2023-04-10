package homework_9.Qnarik_Khachatryan.chapter_12.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}
