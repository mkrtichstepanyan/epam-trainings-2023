package homework_9.Radik_manasyan.chapter12;

import java.lang.reflect.Method;

public class Marker {
    @MyMarker
    public static void myMeth() {
        Marker obj = new Marker();

        try {
            Method m = obj.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("Маркерная аннотацич MyMarker присутствует.");
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Мтод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
