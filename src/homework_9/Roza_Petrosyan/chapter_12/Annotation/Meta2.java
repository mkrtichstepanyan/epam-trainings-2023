package homework_9.Roza_Petrosyan.chapter_12.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
@MyAnno(str = "Meta2", value = 99)
@What(description = "Annotation of class")
public class Meta2 {
    @MyAnno(str = "Annotation example", value = 100)
    @What(description = "Annotation of method")
    public static void myMeth(){
        Meta2 ob = new Meta2();

        try {
            Annotation[] anons = ob.getClass().getAnnotations();

            for (Annotation a:anons) {
                System.out.println(a);
            }
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");
            anons = m.getAnnotations();

            for (Annotation a:anons) {
                System.out.println(a);
            }

//            MyAnno anno = m.getAnnotation(MyAnno.class);
//
//            System.out.println(anno.str() + " " + anno.value());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not fount");
        }
    }
}
