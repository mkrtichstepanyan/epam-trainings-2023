package homework_9.Ani_Kovalenko.Chapter_12.Example_4;

import java.lang.reflect.Method;
public class Meta3 {
    @MyAnno()
    public static void myMeth(){
        Meta3 ob = new Meta3();
        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch(NoSuchMethodException exc){
            System.out.println("Method not Found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
