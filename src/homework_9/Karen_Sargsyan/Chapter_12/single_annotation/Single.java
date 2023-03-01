package homework_9.Karen_Sargsyan.Chapter_12.single_annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value();
}

public class Single {

    @MySingle(100)
    public static void myMeth() throws NoSuchMethodException {
        Single ob = new Single();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMeth();
    }

}
