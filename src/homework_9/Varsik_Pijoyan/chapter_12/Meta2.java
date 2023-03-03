package homework_9.Varsik_Pijoyan.chapter_12;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "An Annotation test class.")
@MyAnno(str = "Meta2", val = 99)
public class Meta2 {
    @What(description = "An Annotation test method.")
    @MyAnno(str = "Testing", val = 100)
    public static void myMethod() {
        Meta2 ob = new Meta2();

        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            System.out.println("All Annotations For Meta2.");

            for (Annotation a: annos) {
                System.out.println(a);
            }
            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("All Annotations For myMeth.");

            for (Annotation a : annos) {
                System.out.println(a);
            }
        }catch (NoSuchMethodException exc){
            System.out.println("No Method Found.");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
