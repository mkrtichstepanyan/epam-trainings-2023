package homework_9.Nona_Asatryan.chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "An annotation test class")
@MyAnno(str = "Meta3", val = 99)
public class Meta3 {

    @What(description = "An annotation test method")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta3 ob = new Meta3();

        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            System.out.println("All annotations for Meta3:");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("All annotations for myMeth:");
            for (Annotation a : annos) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
