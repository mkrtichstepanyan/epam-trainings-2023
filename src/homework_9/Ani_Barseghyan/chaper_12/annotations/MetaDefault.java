package homework_9.Ani_Barseghyan.chaper_12.annotations;

import java.lang.reflect.Method;

public class MetaDefault {
    @MyAnnoDefault
    public static void myMeth() {
        MetaDefault ob = new MetaDefault();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnnoDefault myAnnoDefault = m.getAnnotation(MyAnnoDefault.class);
            System.out.println(myAnnoDefault.str() + " " + myAnnoDefault.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
