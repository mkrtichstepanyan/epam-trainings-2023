package homework_9.Qnarik_Khachatryan.chapter_12.Annotations;

import java.lang.reflect.Method;

class Meta {
    //Annotate a method.
    @MyAnno(str = "Annotation example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        // Obtain the annotation for this method
        // and display the values of the members.

        try {
            // First, get a Class object that represents this class.
            Class<?> c = ob.getClass();

            //Now, get a Method object that represents this method.
            Method m = c.getMethod("myMeth");

            // Next, get the annotation for this class.
            MyAnno anno = m.getAnnotation(MyAnno.class);

            //Finally, display the values.
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
