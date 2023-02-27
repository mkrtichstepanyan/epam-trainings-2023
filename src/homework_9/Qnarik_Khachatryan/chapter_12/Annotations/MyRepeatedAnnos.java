package homework_9.Qnarik_Khachatryan.chapter_12.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//This is the container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnnoRepeatable[] value();
}
