package homework_9.Ani_Kovalenko.Chapter_12.Example_5;

import java.lang.reflect.Method;

public class Marker {
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker is present");
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
