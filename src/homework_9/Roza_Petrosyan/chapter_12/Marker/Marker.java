package homework_9.Roza_Petrosyan.chapter_12.Marker;

import java.lang.reflect.Method;

public class Marker {
    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            if(m.isAnnotationPresent(MyMarker.class)){
                System.out.println("MyMarker exist");
            }

        } catch (NoSuchMethodException exc) {
            System.out.println("Method not fount");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
