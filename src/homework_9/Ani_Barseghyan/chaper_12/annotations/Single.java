package homework_9.Ani_Barseghyan.chaper_12.annotations;

import java.lang.reflect.Method;

public class Single {
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle annotation = m.getAnnotation(MySingle.class);
            System.out.println(annotation.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
