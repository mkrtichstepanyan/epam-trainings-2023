package homework_9.TatevKocharyan.chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "An annotation test class")
@MyAnno(str = "Testing", val = 100)
public class Meta2 {
@What(description = "An annotation test method")
@MyAnno(str = "Testing",val = 100)
    public static void myMeth(){
        Meta2 ob=new Meta2();
        try {
            Annotation annos[]=ob.getClass().getAnnotations();
            System.out.println("All annotations for Meta2");
            for (Annotation a:annos){
                System.out.println(a);
            }
            System.out.println();
            Method m=ob.getClass().getMethod("myMeth");
            annos=m.getAnnotations();
            System.out.println("All annotations for myMeth:");
            for (Annotation a:annos){
                System.out.println(a);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
