package homework_9.Karen_Sargsyan.Chapter_12.annotation3;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "An annotation test class")
@MyAnno(str = "Meta2", val = 99)

public class Meta2 {

    @What(description = "An annotation test method")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() throws NoSuchMethodException {
        Meta2 ob = new Meta2();

        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            System.out.println("All annotations for Meta2:");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("All annotations for myMeth:");
            for (Annotation a : annos) {
                System.out.println(a);
            }

        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }

    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMeth();
    }

}

