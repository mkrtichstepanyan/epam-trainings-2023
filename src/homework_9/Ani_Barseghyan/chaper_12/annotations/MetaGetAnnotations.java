package homework_9.Ani_Barseghyan.chaper_12.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "An annotation test class")
@MyAnno(str = "MetaGetAnnotations", val = 99)
public class MetaGetAnnotations {

    @What(description = "An annotation test method")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        MetaGetAnnotations ob = new MetaGetAnnotations();

        try {
            Annotation[] annotations = ob.getClass().getAnnotations();

            System.out.println("All annotations for MetaGetAnnotations");
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
            System.out.println();
            Method method = ob.getClass().getMethod("myMeth");

            annotations = method.getAnnotations();
            System.out.println("All annotations for myMeth:");
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
