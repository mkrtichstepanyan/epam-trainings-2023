package homework_9.Radik_manasyan.chapter12;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno2(str = "Пример аннотации", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno2 anno = m.getAnnotation(MyAnno2.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
