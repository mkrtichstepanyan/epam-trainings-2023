package homework_9.Karen_Sargsyan.Chapter_12.annotation4;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str() default "Testing";
    int val() default 9000;
}

public class Meta3 {

    @MyAnno()
    public static void myMeth() throws NoSuchMethodException {
        Meta3 ob = new Meta3();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMeth();
    }

}
