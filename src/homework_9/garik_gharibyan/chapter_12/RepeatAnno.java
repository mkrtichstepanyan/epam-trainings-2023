package homework_9.garik_gharibyan.chapter_12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnno.class)
@interface MyAnno1 {
    String str() default "Testing";

    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnno {
    MyAnno1[] value();
}

public class RepeatAnno {

    @MyAnno1(str = "First annotations",val = -1)
    @MyAnno1(str = "Second annotations",val = 100)
    public static void myMeth(String str,int i) {
        RepeatAnno ob = new RepeatAnno();
        try {
            Class<? extends RepeatAnno> c = ob.getClass();
            Method m = c.getMethod("myMeth",String.class,int.class);
            Annotation anno = m.getAnnotation(MyRepeatedAnno.class);
            System.out.println(anno);
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("test",10);
    }
}
