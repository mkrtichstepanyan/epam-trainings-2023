package homework_9.garik_gharibyan.chapter_12;

import java.lang.reflect.Method;

public class Meta2 {

    @MyAnno(str = "Two Parameters",val = 19)
    public static void myMeth1(String str,int i) {
        Meta2 ob = new Meta2();

        try {

            Class<? extends Meta2> c = ob.getClass();
            Method m = c.getMethod("myMeth1",String.class ,int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        myMeth1("test",10);
    }

}
