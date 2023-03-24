package homework_9.Radik_manasyan.chapter12;

import java.lang.reflect.Method;

public class Meta2 {
    @MyAnno2(str = "Два параметра", val = 19)
    public static void myMeth(String str, int i) {
        Meta2 obj = new Meta2();

        try {
            Class<?> c = obj.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno2 anno = m.getAnnotation(MyAnno2.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth("Test", 10);
    }
}
