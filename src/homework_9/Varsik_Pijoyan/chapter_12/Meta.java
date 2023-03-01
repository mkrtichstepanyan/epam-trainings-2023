package homework_9.Varsik_Pijoyan.chapter_12;

import  java.lang.annotation.*;
import java.lang.reflect.*;

public class Meta {
    @MyAnno(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i){
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("MyMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException exc){
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
