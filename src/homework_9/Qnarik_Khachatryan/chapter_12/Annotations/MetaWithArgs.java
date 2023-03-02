package homework_9.Qnarik_Khachatryan.chapter_12.Annotations;

import java.lang.reflect.Method;

class MetaWithArgs {
    //myMeth now has two arguments
    @MyAnno(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i) {
        MetaWithArgs ob = new MetaWithArgs();
        try {
            Class<?> c = ob.getClass();

            //Here, the parameter types are specified.
            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
