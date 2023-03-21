package homework_9.Anush_Ananyan.Chapter_12.Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {
    @MyAnno2 (str = "First annotation", val = -1)
    @MyAnno2(str = "Second annotation", val = 100)
    public static void myMeth(String str, int i){
        RepeatAnno ob = new RepeatAnno();
        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        }catch (NoSuchMethodException e){
            System.out.println("Method not found.");

        }
    }

    public static void main(String[] args) {
        myMeth("Test", 10);
    }
}
