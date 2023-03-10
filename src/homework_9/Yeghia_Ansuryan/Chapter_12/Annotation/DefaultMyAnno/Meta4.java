package homework_9.Yeghia_Ansuryan.Chapter_12.Annotation.DefaultMyAnno;

import java.lang.reflect.Method;

public class Meta4 {
    @MyAnno2()
    public static void myMeth() {
        Meta4 ob = new Meta4();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno2 anno2 = m.getAnnotation(MyAnno2.class);
            System.out.println(anno2.str() + " " + anno2.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Founf.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
