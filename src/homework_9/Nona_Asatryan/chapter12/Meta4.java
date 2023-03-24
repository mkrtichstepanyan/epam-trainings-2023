package homework_9.Nona_Asatryan.chapter12;

import java.lang.reflect.Method;

public class Meta4 {

    @MyAnno2()
    public static void myMeth() {
        Meta4 ob = new Meta4();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");

            MyAnno2 anno = m.getAnnotation(MyAnno2.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found.");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}

