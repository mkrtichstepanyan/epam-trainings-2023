package homework_9.Varsik_Pijoyan.chapter_12;

import java.lang.reflect.Method;

public class Marker {
    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println("MyMarker is present.");
        }catch (NoSuchMethodException exc){
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
