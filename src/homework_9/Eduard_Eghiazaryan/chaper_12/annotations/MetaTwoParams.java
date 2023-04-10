package homework_9.Eduard_Eghiazaryan.chaper_12.annotations;

import java.lang.reflect.Method;

public class MetaTwoParams {
    @MyAnno(str = "Two parameters", val = 19)
    public static void myMeth(String str, int i) {
        MetaTwoParams obj = new MetaTwoParams();

        try {
            Class<?> c = obj.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
