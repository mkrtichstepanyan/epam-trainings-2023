package homework_9.garik_gharibyan.chapter_12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value();
}

public class Single {
    @MySingle(100)
    public static void myMeth() {

        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MySingle.class)) {
                MySingle anno = m.getAnnotation(MySingle.class);
                System.out.println(anno.value());
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }

}
