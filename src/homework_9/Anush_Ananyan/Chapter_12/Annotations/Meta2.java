package homework_9.Anush_Ananyan.Chapter_12.Annotations;

import java.lang.reflect.Method;

public class Meta2 {
    @MyAnnoDefault()
    public static void myMeth() {
        Meta2 ob = new Meta2();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnnoDefault anno = m.getAnnotation(MyAnnoDefault.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }

}
