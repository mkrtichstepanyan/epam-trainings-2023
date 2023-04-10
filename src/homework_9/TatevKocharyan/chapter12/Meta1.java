package homework_9.TatevKocharyan.chapter12;

import java.lang.reflect.Method;

public class Meta1 {
    @MyAnno(str = "Two parameters", val = 19)
    public static void myMeth(String str,int i) {
        Meta1 ob = new Meta1();
        try {
            Class<?> c=ob.getClass();

            Method m=c.getMethod("myMeth",String.class,int.class);
            MyAnno anno=m.getAnnotation(MyAnno.class);
            System.out.println(anno.str()+" "+anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }


    public static void main(String[] args) {
        myMeth("test",10);
    }

}
