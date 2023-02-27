package homework_9.garik_gharibyan.chapter_12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What1(description = "An annotation test class")

@MyAnno(str = "Meta3", val = 99)
public class Meta3 {
    @What1(description = "An annotation test method")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta3 ob = new Meta3();
        try {
            Annotation[] annotations = ob.getClass().getAnnotations();

            System.out.println("All annotations for Meta3: ");
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
            Method method = ob.getClass().getDeclaredMethod("myMeth");
            annotations = method.getAnnotations();
            System.out.println("All annotations for myMeth: ");
            for (Annotation annotation: annotations) {
                System.out.println(annotation);
            }


        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}
