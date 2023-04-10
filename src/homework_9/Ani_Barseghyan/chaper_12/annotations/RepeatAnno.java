package homework_9.Ani_Barseghyan.chaper_12.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {
    @MyAnnoRepeatable(str = "First Annotation", val = -1)
    @MyAnnoRepeatable(str = "Second Annotation", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation annotation = m.getAnnotation(MyRepeatedAnnotation.class);
            System.out.println(annotation);
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
