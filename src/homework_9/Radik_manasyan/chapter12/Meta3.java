package homework_9.Radik_manasyan.chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "Аннотация тестогого класа")
@MyAnno2(str = "Meta3", val = 99)
public class Meta3 {
    @What(description = "Аннотация тестогого класа")
    @MyAnno2(str = "Testing", val = 100)
    public static void myMeth() {
        Meta3 obj = new Meta3();

        try {
            Annotation[] annos = obj.getClass().getAnnotations();
            System.out.println("Все аннотации для класса Meta3");
            for (Annotation anno : annos) {
                System.out.println(anno);
            }
            System.out.println();

            Method m = obj.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("Все аннотации для метода myMeth():");
            for (Annotation anno : annos) {
                System.out.println(anno);
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
