package homework_14.Varsik_Pijoyan.chapter_14;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob;

        //Create  NonGen Object and store
        //an Integer in it. Autoboxing still occurs
        iob = new NonGen(88);

        //Show the type of data used by iob
        iob.showType();

        //Get the value of iob
        //This time, a cast is necessary
        int v = (Integer) iob.getOb();
        System.out.println("value: " + v);

        System.out.println();

        //Create another NonGen object and
        //store a String in it
        NonGen strOb = new NonGen("Non-Generics test");

        //Show type of data used by strOb
        strOb.showType();

        //Get the value of strOb
        String str = (String) strOb.getOb();
        System.out.println("value: " + str);

    }
}
