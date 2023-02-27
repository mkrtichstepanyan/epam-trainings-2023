package homework_9.araksya.ghazaryan.chapter_12;
import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}