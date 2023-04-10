package homework_9.TatevKocharyan.chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Marker {


    @MyMarker
    public static void myMeth(){
        Marker ob=new Marker();
        Class<?> c=ob.getClass();
        Method m= null;
        try {
            m = c.getMethod("myMeth");
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
        boolean anno=m.isAnnotationPresent(MyMarker.class);
        if (anno){
            System.out.println("My marker is present");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}
