package homework_9.Vladimir_Vanyan.chapter_12;

import java.lang.reflect.Method;

public class Single {
    //Annotate a method using a single-member annotation
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());   //displays 100
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not Found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
