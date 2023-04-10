package homework_9.Nona_Asatryan.chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker { }
public class Marker {

    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker is present.");
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
