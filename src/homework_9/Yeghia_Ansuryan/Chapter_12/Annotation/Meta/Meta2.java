package homework_9.Yeghia_Ansuryan.Chapter_12.Annotation.Meta;

import java.lang.reflect.Method;

public class Meta2 {
    @MyAnno(str = "Two Parameters", val = 19)
    public static void myMeth(String atr, int i) {
        Meta2 ob = new Meta2();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
