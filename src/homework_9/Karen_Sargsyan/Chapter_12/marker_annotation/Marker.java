package homework_9.Karen_Sargsyan.Chapter_12.marker_annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker { }

public class Marker {

    @MyMarker
    public static void myMeth() throws NoSuchMethodException {
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker is present.");
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMeth();
    }

}
