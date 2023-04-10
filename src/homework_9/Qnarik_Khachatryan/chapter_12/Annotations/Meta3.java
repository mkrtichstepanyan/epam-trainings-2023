package homework_9.Qnarik_Khachatryan.chapter_12.Annotations;

import java.lang.reflect.Method;

class Meta3 {
    // Annotate a method using the default values.
    @MyAnnoWithDefault()
    public static void myMeth() {
        Meta3 ob = new Meta3();

        //Obtain the annotation for this method
        // and display the values of the members

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnnoWithDefault anno = m.getAnnotation(MyAnnoWithDefault.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
