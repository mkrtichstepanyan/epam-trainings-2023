package homework_9.garik_gharibyan.chapter_12;

import java.lang.reflect.Method;

public class Meta4 {
    @MyAnno()
    public static void myMeth() {
        Meta4 ob = new Meta4();

        try {
            Class<? extends Meta4> c = ob.getClass();
            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
