package homework_9.Ani_Kovalenko.Chapter_12.Example_2;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("MethodNot Found");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
