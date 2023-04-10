package homework_9.Radik_manasyan.chapter12;

import java.lang.reflect.Method;

public class Meta4 {
    @DefaultAnno()
    public static void myMeth() {
        Meta4 obj = new Meta4();

        try {
            Class<?> c = obj.getClass();
            Method m = c.getMethod("myMeth");

            DefaultAnno anno = m.getAnnotation(DefaultAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
