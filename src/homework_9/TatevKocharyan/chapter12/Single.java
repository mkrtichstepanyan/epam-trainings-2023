package homework_9.TatevKocharyan.chapter12;

import java.lang.reflect.Method;

public class Single {
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();
        Class<?> c = ob.getClass();
        Method m = null;
        try {
            m = c.getMethod("myMeth");

            MySingle anno = m.getAnnotation(MySingle.class);

        } catch (NoSuchMethodException e) {
            System.out.println("Method Nt Found");

        }

    }
    public static void main(String [] args){
        myMeth();

    }
}
