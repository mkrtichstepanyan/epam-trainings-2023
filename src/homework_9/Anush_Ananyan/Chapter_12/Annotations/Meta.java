package homework_9.Anush_Ananyan.Chapter_12.Annotations;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not Found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
