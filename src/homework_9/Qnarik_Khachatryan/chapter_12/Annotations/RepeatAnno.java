package homework_9.Qnarik_Khachatryan.chapter_12.Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class RepeatAnno {
    //Repeat MyAnnoRepeatable on myMeth()
    @MyAnnoRepeatable(str = "First annotation", val = -1)
    @MyAnnoRepeatable(str = "Second annotation", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();

            //obtain the annotations for myMeth()
            Method m = c.getMethod("myMeth", String.class, int.class);

            //Display the repeated MyAnnoRepeatable annotations/
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
