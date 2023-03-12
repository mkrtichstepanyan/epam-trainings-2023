package homework_9.Nona_Asatryan.chapter12;

import java.lang.reflect.Method;

public class Single {
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);

            System.out.println(anno.value());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
