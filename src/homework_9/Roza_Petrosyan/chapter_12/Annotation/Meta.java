package homework_9.Roza_Petrosyan.chapter_12.Annotation;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "Annotation example", value = 100)
    public static void myMeth(String str, int i){
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth",String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.value());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not fount");
        }
    }
}
