package homework_9.Qnarik_Khachatryan.chapter_12.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// A single-member annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value(); // this variable name must be value
}
