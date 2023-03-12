package homework_9.Yeghia_Ansuryan.Chapter_12.Annotation.Meta;

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
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found");

        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
