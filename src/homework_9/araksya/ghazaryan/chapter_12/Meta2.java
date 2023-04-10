package homework_9.araksya.ghazaryan.chapter_12;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyAnno(str = "Meta2", val = 99)
public class Meta2 {

    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();

            System.out.println("All annotations for Meta2: ");
            for (Annotation anno : annos) {
                System.out.println(anno);
            }
            System.out.println();
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("All annotations for myMeth: ");
            for (Annotation anno : annos) {
                System.out.println(anno);
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
