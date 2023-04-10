package homework_14.Varsik_Pijoyan.chapter_14;

public class GenDemo {
    public static void main(String[] args) {
        //Create a Gen reference for Integers.
        Gen<Integer> iob;

        iob = new Gen<Integer>(88);

        //Show the type of data used by iob
        iob.showType();

        //Get the value in iob
        int v = iob.getOb();
        System.out.println("value: " + v);

        System.out.println();

        //Create a Gen object for Strings
        Gen<String> strOb = new Gen<String>("Generics Test");

        //Show the type if data used by strOb
        strOb.showType();

        //Get the value in strOb
        String str = strOb.getOb();
        System.out.println("value: " + str);

    }
}
