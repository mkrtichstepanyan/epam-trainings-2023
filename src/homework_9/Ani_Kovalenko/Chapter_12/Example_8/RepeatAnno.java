package homework_9.Ani_Kovalenko.Chapter_12.Example_8;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {
    @MyAnno(str = "First annotation", val = -1)
    @MyAnno(str = "Second annotaion", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
